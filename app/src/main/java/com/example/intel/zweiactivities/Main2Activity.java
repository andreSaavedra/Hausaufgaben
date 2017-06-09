package com.example.intel.zweiactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Importamos texto de Act.1
        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("Frase");

        String textoPasado = fraseimportada;
        TextView out = (TextView)findViewById(R.id.textView4);
        out.setText(textoPasado);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0); }
        });
    }
}

