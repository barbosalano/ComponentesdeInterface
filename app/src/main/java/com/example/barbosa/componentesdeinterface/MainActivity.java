package com.example.barbosa.componentesdeinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch swStatus;
    private ToggleButton toggleStatus;
    private CheckBox cbStatus;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swStatus = findViewById(R.id.swStatus);
        toggleStatus = findViewById(R.id.toggleStatus);
        cbStatus = findViewById(R.id.cbStatus);
        tvResultado = findViewById(R.id.tvResultado);

    }

    public void btnEnviar(View view) {

        /*
        if (swStatus.isChecked()) {
            tvResultado.setText("O switch está ligado");
        } else {
            tvResultado.setText("O switch está desligado");
        } */

        if (toggleStatus.isChecked()){
            tvResultado.setText("Toggle está ligado");
        }else{
            tvResultado.setText("Toggle está desligado");
        }
        /*
        if (cbStatus.isChecked()){
            tvResultado.setText("CheckBox está marcado");
        }else {
            tvResultado.setText("O checkBox não está marcado");
        }  */
    }


}
