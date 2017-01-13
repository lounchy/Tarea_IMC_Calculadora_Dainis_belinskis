package com.example.lounchy.imc;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EscuchaButton escuchaButton = new EscuchaButton(this);

        Button calcular = (Button)findViewById(R.id.calcular_button);
        calcular.setOnClickListener(escuchaButton);

    }
}
