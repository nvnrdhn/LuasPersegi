package com.hoverlight.luaspersegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText panjang, lebar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hasil = findViewById(R.id.hasil);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p, l, res;
                p = Double.valueOf(panjang.getText().toString());
                l = Double.valueOf(lebar.getText().toString());
                res = p*l;
                hasil.setText("Hasil : "+res);
            }
        });
    }
}
