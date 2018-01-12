package id.co.djoendhie.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjangActivity extends AppCompatActivity {

    EditText etAlas1, etTinggi1;
    Button button;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        // manggl id wdget
        etAlas1 = (EditText) findViewById(R.id.etAlas1);
        etTinggi1= (EditText) findViewById(R.id.etTinggi1);
        button = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //axse ktk d clcx
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambel dare wdget edt txt trus masuxxen dlm strng
                String nAlas= etAlas1.getText().toString();
                String nTinggi= etTinggi1.getText().toString();



                //pas empty
                if(nAlas.isEmpty()) {
                    //warng
                    etAlas1.setError("jgn kosong");
                }else if (nTinggi.isEmpty()) {
                    etTinggi1.setError("jgn empty");
                }else{

                    // mengubah nlae dare strng k int
                    int aAlas1= Integer.parseInt(nAlas);
                    int aTinggi1= Integer.parseInt(nTinggi);

                    //kondese xetexa pjg dan lebar tdx xoseong
                    int hasilHitungkeliling = 2 * (aAlas1 + aTinggi1);
                    int hasilHitungLuas = aAlas1 * aTinggi1;


                    // manampel xan hsl
                    txtHasil.setText("keliling = " + hasilHitungkeliling + "    " + "Luas = " + hasilHitungLuas);

                }
            }
        });
    }
}