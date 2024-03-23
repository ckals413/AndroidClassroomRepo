package com.example.a03;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ㅇ
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView2);
    }

    public void onButtonClick(View view) {
        // EditText에서 숫자 가져오기
        String inputText = editText.getText().toString();
        if (!inputText.isEmpty()) {
            // 1부터 100까지의 랜덤한 숫자 생성
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; // 1부터 100까지의 랜덤한 숫자
            int inputNumber = Integer.parseInt(inputText);

            // 결과 비교x
            if (inputNumber > randomNumber) {
                textView.setText("Down");
            } else if (inputNumber < randomNumber) {
                textView.setText("Up");
            } else {
                textView.setText("맞았습니다!");
            }
        }
    }
}
