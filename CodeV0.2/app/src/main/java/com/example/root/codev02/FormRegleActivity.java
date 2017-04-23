package com.example.root.codev02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FormRegleActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;

    private TextView tvDisplayDate;


    private int year;
    private int month;
    private int day;


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_regle);
        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FormRegleActivity.this,TabActivity.class));

            }
        });

        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
        setCurrentDateOnView();

    }

    // display current date
    public void setCurrentDateOnView() {

        tvDisplayDate = (TextView) findViewById(R.id.editText3);


        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        // set current date into textview
        tvDisplayDate.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(month + 1).append("-").append(day).append("-")
                .append(year).append(" "));

        // set current date into datepicker


    }

    public void addListenerOnSpinnerItemSelection() {
        spinner2 = (Spinner) findViewById(R.id.spinner5);
        spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner1 = (Spinner) findViewById(R.id.spinner6);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner6);
        spinner2 = (Spinner) findViewById(R.id.spinner5);

    }
}