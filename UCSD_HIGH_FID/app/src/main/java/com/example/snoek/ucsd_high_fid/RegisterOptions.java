package com.example.snoek.ucsd_high_fid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_options);

        Button btnStudent = findViewById(R.id.button2);
        Button btnNonStudent = findViewById(R.id.button3);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterOptions.this, RegisterStudent.class));
            }
        });

        btnNonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterOptions.this, RegisterNonStudent.class));
            }
        });
    }
}
