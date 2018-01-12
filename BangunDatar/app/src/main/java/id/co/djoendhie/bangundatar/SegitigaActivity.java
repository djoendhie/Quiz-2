package id.co.djoendhie.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText etAlas, etTinggi;
    Button button;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        // manggl id wdget
        etAlas = (EditText) findViewById(R.id.etAlas);
        etTinggi= (EditText) findViewById(R.id.etTinggi);
        button = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //axse ktk d clcx
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambel dare wdget edt txt trus masuxxen dlm strng
                String nAlas= etAlas.getText().toString();
                String nTinggi= etTinggi.getText().toString();



                //pas empty
                if(nAlas.isEmpty()) {
                    //warng
                    etAlas.setError("jgn kosong");
                }else if (nTinggi.isEmpty()) {
                    etTinggi.setError("jgn empty");
                }else{

                    // mengubah nlae dare strng k int
                    int aAlas= Integer.parseInt(nAlas);
                    int aTinggi= Integer.parseInt(nTinggi);

                    //kondese xetexa pjg dan lebar tdx xoseong
                    int hasilHitungkeliling = aAlas + aTinggi ;
                    int hasilHitungLuas = 1/2 * aAlas * aTinggi;


                    // manampel xan hsl
                    txtHasil.setText("keliling = " + hasilHitungkeliling + "    " + "Luas = " + hasilHitungLuas);

                }
            }
        });
    }
}