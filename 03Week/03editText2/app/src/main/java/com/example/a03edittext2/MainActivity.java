package com.example.a03edittext2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassWord;
    private EditText editTextPhoneNumber;
    private TextView textViewUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editName);
        editTextPassWord = findViewById(R.id.editPass);
        editTextPhoneNumber = findViewById(R.id.editPhone);
        textViewUserInfo = findViewById(R.id.textViewUserInfo);
    }
    public void onClicked(View v){
        String username = editTextUsername.getText().toString();
        String password = editTextPassWord.getText().toString();
        String phoneNumber = editTextPhoneNumber.getText().toString();
        String UserInfo = "아이디: "+username+"\n패스워드: "+ password+"\n 전화번호: "+ phoneNumber;

        textViewUserInfo.setText(UserInfo);
    }
}