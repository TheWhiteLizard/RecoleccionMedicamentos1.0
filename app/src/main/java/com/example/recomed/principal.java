package com.example.recomed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    private Button btn_vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn_vista = findViewById(R.id.button);
        btn_vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(principal.this, UserProfile.class);
                startActivity(i);
            }
        });


    }

}