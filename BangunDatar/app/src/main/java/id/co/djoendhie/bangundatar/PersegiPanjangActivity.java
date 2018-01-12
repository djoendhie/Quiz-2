package id.co.djoendhie.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button button;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        // manggl id wdget
        etPanjang = (EditText) findViewById(R.id.etPanjang);
        etLebar= (EditText) findViewById(R.id.etLebar);
        button = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //axse ktk d clcx
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambel dare wdget edt txt trus masuxxen dlm strng
                String nPanjang = etPanjang.getText().toString();
                String nLebar= etLebar.getText().toString();



                //pas empty
                if(nPanjang.isEmpty()) {
                    //warng
                    etPanjang.setError("jgn kosong");
                }else if (nLebar.isEmpty()) {
                    etLebar.setError("jgn empty");
                }else{

                    // mengubah nlae dare strng k int
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar= Integer.parseInt(nLebar);

                    //kondese xetexa pjg dan lebar tdx xoseong
                    int hasilHitungkeliling = 2 * (aPanjang + aLebar);
                    int hasilHitungLuas = aPanjang * aLebar;


                    // manampel xan hsl
                    txtHasil.setText("keliling = " + hasilHitungkeliling + "    " + "Luas = " + hasilHitungLuas);

                }
            }
        });
    }
}