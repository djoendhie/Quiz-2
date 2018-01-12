package id.co.djoendhie.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare wdget btn
    Button btnPersegi, btnSegitiga, btnLingkaran, btnPersegiPanjang, btnJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // memanggl id btn
        btnPersegi = (Button)findViewById(R.id.btnPersegi);
        //agar bsa d clc
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //menambah intent agar pndah halaman k actyvyty laen
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //bear start
                startActivity(a1);

            }
        });

        btnJajarGenjang = (Button)findViewById(R.id.btnJajarGenjang);
        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a2 = new Intent(getApplicationContext(), JajarGenjangActivity.class);
                startActivity(a2);
            }
        });

        btnLingkaran = (Button)findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a3 = new Intent(getApplicationContext(), LingkaranActivity.class);
                startActivity(a3);
            }
        });

        btnPersegiPanjang = (Button)findViewById(R.id.btnPersegiPanjang);
        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a4 = new Intent(getApplicationContext(), PersegiPanjangActivity.class);
                startActivity(a4);
            }
        });

        btnSegitiga = (Button)findViewById(R.id.btnSegitiga);
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a5 = new Intent(getApplicationContext(), SegitigaActivity.class);
                startActivity(a5);
            }
        });

    }
}
