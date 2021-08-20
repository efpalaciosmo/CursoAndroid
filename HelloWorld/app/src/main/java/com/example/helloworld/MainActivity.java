package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Datos del view

        EditText etHello = findViewById(R.id.etHello);
        Button btHello = findViewById(R.id.btHello);

        //Evento para coger lo que hay en editText
        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hello = etHello.getText().toString();

                if(hello.isEmpty()){
                    return;
                }

                // Envio lo ingresado al otro activity
                Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                intent.putExtra("msgHello", hello);
                startActivity(intent);

            }
        });

    }
}