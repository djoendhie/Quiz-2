package id.co.djoendhie.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText etPh, etR;
    Button button;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        // manggl id wdget
        etPh= (EditText) findViewById(R.id.etPh);
        etR= (EditText) findViewById(R.id.etR);
        button = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //axse ktk d clcx
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambel dare wdget edt txt trus masuxxen dlm strng
                String nPh= etPh.getText().toString();
                String nR= etR.getText().toString();



                //pas empty
                if(nPh.isEmpty()) {
                    //warng
                    etPh.setError("jgn kosong");
                }else if (nR.isEmpty()) {
                    etR.setError("jgn empty");
                }else{

                    // mengubah nlae dare strng k int
                    int aPh= Integer.parseInt(nPh);
                    int aR= Integer.parseInt(nR);

                    //kondese xetexa pjg dan lebar tdx xoseong
                    int hasilHitungkeliling = 2 * aPh * aR;
                    int hasilHitungLuas = 2 * aPh * aR + aPh + aR;


                    // manampel xan hsl
                    txtHasil.setText("keliling = " + hasilHitungkeliling + "    " + "Luas = " + hasilHitungLuas);

                }
            }
        });
    }
}