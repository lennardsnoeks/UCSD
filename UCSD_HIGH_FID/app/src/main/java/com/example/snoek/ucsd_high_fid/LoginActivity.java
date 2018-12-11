package com.example.snoek.ucsd_high_fid;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textView = findViewById(R.id.textView5);

        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onClick(View v) {
        startActivity(new Intent(LoginActivity.this, RegisterOptions.class));
    }

    public void onClickLogin(View v) {
        String naam = ((EditText) findViewById(R.id.editText2)).getText().toString();
        String wachtwoord = ((EditText) findViewById(R.id.editText)).getText().toString();
        if (naam.equals("student") && wachtwoord.equals("test")) {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        } else if (naam.equals("begeleider") && wachtwoord.equals("test")) {
            startActivity(new Intent(LoginActivity.this, Home2Activity.class));
        }
    }
}
