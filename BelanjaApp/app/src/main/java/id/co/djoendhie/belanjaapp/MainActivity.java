package id.co.djoendhie.belanjaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBelanja1, etBelanja2, etBelanja3, etBelanja4, etBelanja5;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBelanja1 = (EditText)findViewById(R.id.etBelanja1);
        etBelanja2 = (EditText) findViewById(R.id.etBelanja2);
        etBelanja3 = (EditText)findViewById(R.id.etBelanja3);
        etBelanja4=(EditText)findViewById(R.id.etBelanja4);
        etBelanja5=(EditText)findViewById(R.id.etBelanja5);
        button=(Button)findViewById(R.id.btnCare);
        textView=(TextView)findViewById(R.id.txtHasel);

//        etBelanja1 =(EditText)findViewById(R.id.etBelanja1);
//        etBelanja2 =(EditText)findViewById(R.id.etBelanja2);
//        etBelanja3 =(EditText)findViewById(R.id.etBelanja3);
//        etBelanja4 =(EditText)findViewById(R.id.etBelanja4);
//        etBelanja5 =(EditText)findViewById(R.id.etBelanja5);
//        btnCare = (Button) findViewById(R.id.btnCare);
//        txtHasel = (TextView) findViewById(R.id.txtHasel);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nBelanja1 = etBelanja1.getText().toString();
                String nBelanja2 = etBelanja2.getText().toString();
                String nBelanja3 = etBelanja3.getText().toString();
                String nBelanja4 = etBelanja4.getText().toString();
                String nBelanja5 = etBelanja5.getText().toString();

                if (nBelanja1.isEmpty()) {
                    etBelanja1.setError("jgn Empty");
                }else{

                    int aBelanja1 = Integer.parseInt(nBelanja1);
                    int aBelanja2 = Integer.parseInt(nBelanja2);
                    int aBelanja3 = Integer.parseInt(nBelanja3);
                    int aBelanja4 = Integer.parseInt(nBelanja4);
                    int aBelanja5 = Integer.parseInt(nBelanja5);

                    int total = (aBelanja1 * 2000 ) + (aBelanja2 * 3000) + (aBelanja3 * 1000) + (aBelanja4 * 5000) + (aBelanja5 * 2500);
                    int HaselRata = aBelanja1 + aBelanja2 + aBelanja3 + aBelanja4 + aBelanja5;

                    textView.setText("Jumlah = " + " " + HaselRata + "Harga = " + " " + total);

                }
            }
        });
    }
}
