package com.example.students_form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        CardView cardView = findViewById(R.id.cardView1);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
        CardView cardView1 = findViewById(R.id.CardView2);

        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
        CardView cardView2 = findViewById(R.id.CardView3);

        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
        CardView cardView3 = findViewById(R.id.apple);

        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
    }
}