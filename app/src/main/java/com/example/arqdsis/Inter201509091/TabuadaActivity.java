package com.example.arqdsis.Inter201509091;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @Autor: Rafael Dias - 201509091
 */
public class TabuadaActivity extends Activity {

    /**
     * @Autor: Rafael Dias - 201509091
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);
        Intent intent = getIntent();
        String sTabuada = intent.getStringExtra(MainActivity.TABUADA_DE);
        String sAte = intent.getStringExtra(MainActivity.TABUADA_ATE);
        int iTabuada = Integer.parseInt(sTabuada);
        int iAte = Integer.parseInt(sAte);
        ArrayList<String> listaCalculo = new ArrayList<String>();

        for (int i = 0; i <= iAte; i++){
            listaCalculo.add(iTabuada + "x" + i +" = " + (i * iTabuada));
        }

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaCalculo);

        ListView lst = (ListView)findViewById(R.id.lst_calculo);

        lst.setAdapter(adapter);

    }
}
