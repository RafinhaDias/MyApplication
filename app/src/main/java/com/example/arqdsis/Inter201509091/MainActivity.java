package com.example.arqdsis.Inter201509091;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

import com.example.arqdsis.myapplication.R;


/**
 * @Autor: Rafael Dias - 201509091
 */
public class MainActivity extends Activity {


    public static final String TABUADA_DE = "com.example.arqdsis.Inter201509091.TABUADA_DE";
    public static final String TABUADA_ATE = "com.example.arqdsis.Inter201509091.TABUADA_ATE";

    /**
     * @Autor: Rafael Dias - 201509091
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @Autor: Rafael Dias - 201509091
     */
    public void calcular(View view) {
        Intent intent = new Intent(this, TabuadaActivity.class);
        EditText txt_tabuada = (EditText)findViewById(R.id.edt_tabuada);
        EditText txt_ate = (EditText)findViewById(R.id.edt_ate);
        String qualtabuada = txt_tabuada.getText().toString();
        String ate_tabuada = txt_ate.getText().toString();
        intent.putExtra(TABUADA_DE,qualtabuada);
        intent.putExtra(TABUADA_ATE,ate_tabuada);
        startActivity(intent);

    }
}