package com.example.snoek.ucsd_high_fid;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterNonStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_non_student);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");

        ((DatePickerFragment) newFragment).setOnDateChangedEventListener(new DateChangedEventListener() {
            @Override
            public void onDateChanged(String date) {
                Button button = findViewById(R.id.button7);
                button.setText(date);
            }
        });

        Button btnStudent = findViewById(R.id.button5);
        Button btnNonStudent = findViewById(R.id.button6);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterNonStudent.this, RegisterOptions.class));
            }
        });

        btnNonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterNonStudent.this, HomeActivity.class));
            }
        });
    }
}