package com.example.study2_1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textV;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.edittext);
        textV = (TextView) findViewById(R.id.textView);
    }
    public void onClicked(View v){
        String str = et.getText().toString();
        textV.setText(str);
    }

}