package com.example.a03_;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.dice_image);
    }

    public void rollDice(View view) {
        // 주사위 눈금의 이미지 ID 배열
        int[] diceImages = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3};

        // 랜덤한 주사위 눈금 선택
        Random random = new Random();
        int randomNumber = random.nextInt(2); // 0부터 5까지의 랜덤한 숫자 생성
        int drawableResource = diceImages[randomNumber];

        // 이미지뷰에 랜덤한 주사위 이미지 설정
        diceImage.setImageResource(drawableResource);
    }
}
