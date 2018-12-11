package com.example.snoek.ucsd_high_fid;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    private String m_date = "";

    private DateChangedEventListener m_onDateChangedEventListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        m_date = day + "/" + month + "/" + year;
        if(m_onDateChangedEventListener != null)
        {
            m_onDateChangedEventListener.onDateChanged(m_date);
        }
    }

    public void setOnDateChangedEventListener(DateChangedEventListener eventListener)
    {
        m_onDateChangedEventListener = eventListener;
    }
}