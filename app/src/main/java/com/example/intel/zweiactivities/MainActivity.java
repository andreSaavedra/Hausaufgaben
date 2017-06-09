package com.example.intel.zweiactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cargamos el texto a exportar
        final EditText textoexportar;
        textoexportar=(EditText)findViewById(R.id.editText);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),Main2Activity.class);
                //Exportar parametro
                intent.putExtra("Frase", textoexportar.getText().toString());
                startActivityForResult(intent,0);
            }
        });
    }

}
