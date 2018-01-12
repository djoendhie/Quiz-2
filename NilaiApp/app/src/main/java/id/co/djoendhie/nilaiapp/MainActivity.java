package id.co.djoendhie.nilaiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBi, etMtk, etCom, etE;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etBi = (EditText)findViewById(R.id.etBi);
        etMtk = (EditText)findViewById(R.id.etMtk);
        etCom = (EditText)findViewById(R.id.etCom);
        etE = (EditText)findViewById(R.id.etE);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nBi = etBi.getText().toString();
                String nMtk = etMtk.getText().toString();
                String nE = etE.getText().toString();
                String nCom = etCom.getText().toString();

                if (nBi.isEmpty()) {
                    etBi.setError("jgn empty");
                }else if (nCom.isEmpty()) {
                    etCom.setError("jgn Empty");
                }else if (nE.isEmpty()){
                    etE.setError("jgn Empty");
                }else if (nE.isEmpty()) {
                    etMtk.setError("jgn Empty");
                }else {

                    int aBi = Integer.parseInt(nBi);
                    int aCom = Integer.parseInt(nCom);
                    int aE = Integer.parseInt(nE);
                    int aMtk = Integer.parseInt(nMtk);

                    int hasilHitungRata = aBi + aCom + aE + aMtk % 4;

                    textView.setText("Rata-Rata = " + " " + hasilHitungRata);
                }
                }
        });
    }
}
