package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText eText1;
    EditText eText2;
    EditText eText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText1 = (EditText) findViewById(R.id.edit1);
        eText2 = (EditText) findViewById(R.id.edit2);
        eText3 = (EditText) findViewById(R.id.edit3);

    }
    // 덧셈 기능을 수행하는 메서드
    public void cal_plus(View view){
        // EditText에서 사용자 입력을 가져옴
        String s1 = eText1.getText().toString(); // 첫 번째 숫자
        String s2 = eText2.getText().toString(); // 두 번째 숫자
        // 가져온 문자열을 정수형으로 변환하여 더함
        int result = Integer.parseInt(s1) + Integer.parseInt(s2);
        // 결과를 결과 EditText에 표시
        eText3.setText("" + result);
    }

    // 뺄셈 기능을 수행하는 메서드
    public void cal_minus(View view){
        String s1 = eText1.getText().toString(); // 첫 번째 숫자
        String s2 = eText2.getText().toString(); // 두 번째 숫자
        int result = Integer.parseInt(s1) - Integer.parseInt(s2); // 두 숫자를 뺌
        eText3.setText("" + result); // 결과를 결과 EditText에 표시
    }

    // 나눗셈 기능을 수행하는 메서드
    public void cal_div(View view){
        String s1 = eText1.getText().toString(); // 첫 번째 숫자
        String s2 = eText2.getText().toString(); // 두 번째 숫자
        int result = Integer.parseInt(s1) / Integer.parseInt(s2); // 두 숫자를 나눔
        eText3.setText("" + result); // 결과를 결과 EditText에 표시
    }

    // 곱셈 기능을 수행하는 메서드
    public void cal_mul(View view){
        String s1 = eText1.getText().toString(); // 첫 번째 숫자
        String s2 = eText2.getText().toString(); // 두 번째 숫자
        int result = Integer.parseInt(s1) * Integer.parseInt(s2); // 두 숫자를 곱함
        eText3.setText("" + result); // 결과를 결과 EditText에 표시
    }

}