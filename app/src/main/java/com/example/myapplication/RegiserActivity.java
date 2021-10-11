package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegiserActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinner;
    private static final String[] paths = {"item 1", "item 2", "item 3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiser);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    public void onClickRegister(View view) {
        TextInputLayout emailLayout = findViewById(R.id.emailLayout);
        TextInputEditText textEmail =  findViewById(R.id.inputEmail);

        String text = textEmail.getText().toString();
        if(text.isEmpty())
        {
            emailLayout.setError("Поле є пустим");
        }
        else
            emailLayout.setError("");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                int a=23;
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                int c=23;
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                int b=23;
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}