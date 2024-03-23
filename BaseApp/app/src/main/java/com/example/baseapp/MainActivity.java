package com.example.baseapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   Button button1;
   Button button2;
   CheckBox checkBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.player1_1);

        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"버튼이 눌렸어요",Toast.LENGTH_SHORT).show();
                //finish(); //프로그램 종료
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });
        button1.setBackgroundColor(Color.GREEN);
        button1.setTextColor(Color.BLACK   );

        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"전화번호 버튼이 눌렸어요",Toast.LENGTH_SHORT).show();
                //finish(); //프로그램 종료
               Intent kIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/114"));
               startActivity(kIntent);
            }
        });

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //LENGTH_LONG은 밑에 글자가 표시되는게 3.5초 정도이고, TOAST.LENGTH_SHORT는 2초정도란다.
                Toast.makeText(getApplicationContext(),"체크박스가 눌렸어요!!!",Toast.LENGTH_LONG).show();
            }
        });



    }
}