package id.co.djoendhie.belanjaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelanjaActivity extends AppCompatActivity {

    EditText etBelanja1, etBelanja2, etBelanja3, etBelanja4, etBelanja5;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belanja);

        etBelanja1 = (EditText) findViewById(R.id.etBelanja1);
        etBelanja2 = (EditText) findViewById(R.id.etBelanja2);
        etBelanja3 = (EditText) findViewById(R.id.etBelanja3);
        etBelanja4 = (EditText) findViewById(R.id.etBelanja4);
        etBelanja5 = (EditText) findViewById(R.id.etBelanja5);
        button = (Button) findViewById(R.id.btnCare);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
