package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegiserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiser);
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

}