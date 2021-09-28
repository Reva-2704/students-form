package com.example.students_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button1 = findViewById(R.id.newrequest);

        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
        });
        Button button2 = findViewById(R.id.create);

        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
            startActivity(intent);
        });
    }
}