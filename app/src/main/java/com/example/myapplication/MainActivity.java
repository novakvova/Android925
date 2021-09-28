package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtData=findViewById(R.id.txtData);

    }

    public void ClickBtnHello(View view) {
        Toast.makeText(this,txtData.getText(),Toast.LENGTH_LONG).show();
    }
}