package com.example.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main extends AppCompatActivity {

    TextView teks;
    Button ubah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks = (TextView) findViewById(R.id.teks);
        ubah = (Button) findViewById(R.id.ubah);

        klik1();

    }

    public void klik1() {
        ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rubah1();
                klik2();
            }
        });
    }

    public void klik2() {
        ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rubah2();
                klik1();
            }
        });
    }

    public void rubah1() {
        teks.setText("Teks Berubah");
    }

    public void rubah2() {
        teks.setText("Berubah Lagi");
    }
}
