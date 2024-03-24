package com.example.a03_image;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private int scaleTypeIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public void changeScaleType(View view){
        ImageView.ScaleType[] scaleTypes = {
                ImageView.ScaleType.CENTER,
                ImageView.ScaleType.CENTER_CROP,
                ImageView.ScaleType.CENTER_INSIDE,
                ImageView.ScaleType.FIT_CENTER,
                ImageView.ScaleType.FIT_XY
        };
        imageView.setScaleType(scaleTypes[scaleTypeIndex]);
        scaleTypeIndex = (scaleTypeIndex+1)%scaleTypes.length;
    }

    //버튼 클릭 이벤트 처리: 회전 변경
    public void changeRotation(View view){
        // 현재의 각도 정보를 얻어서 45도 기울인다.
        imageView.setRotation(imageView.getRotation()+45);
    }
    //버튼 클릭 이벤트 처리 :alpha변경 (투명도 변경?)
    public void changeAlpha(View view){
        float alpha = imageView.getAlpha();
        alpha = (alpha == 1.0f)?0.5f : 1.0f;
        imageView.setAlpha(alpha);
    }



}