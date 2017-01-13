package com.example.lounchy.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;





public class IntentActivity extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        EscuchaButton escuchaButton = new EscuchaButton(this);

       TextView textView = (TextView)findViewById(R.id.resultado);

        Intent intent = getIntent();

        String fResultado = intent.getStringExtra("resultado");
        textView.setText(fResultado);

        Button volver = (Button)findViewById(R.id.volver_button);
        volver.setOnClickListener(escuchaButton);
    }
}
