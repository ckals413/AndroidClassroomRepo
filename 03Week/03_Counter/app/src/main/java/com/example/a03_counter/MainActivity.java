package com.example.a03_counter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCount = findViewById(R.id.textViewCount);
    }
    public void numberUp(View view){
        //카운트 증가
        count= count +1;
        textViewCount.setText("카운터: "+count);
    }
    public void numberDown(View view){
        //카운트 감소
        count = count - 1;
        textViewCount.setText("카운터: "+count);
    }
}