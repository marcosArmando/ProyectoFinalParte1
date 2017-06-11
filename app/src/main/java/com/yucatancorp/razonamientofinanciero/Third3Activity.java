package com.yucatancorp.razonamientofinanciero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Third3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);

        Intent intento = getIntent();
        String valor2 = intento.getStringExtra("valorf");

        TextView txtVwImprtnt = (TextView)findViewById(R.id.txVwImprtnt);
        txtVwImprtnt.setText(valor2);

    }
}
