package com.tq.tqmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.EncryptUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_test = findViewById(R.id.tv_test);
        tv_test.setText(getDes());
    }

    public String getDes(){
        try {
            String text = "EuwXADJmB0aZghRR0mWNHS/3r+K6TPeMQr1GgAylFW29L1L/EX03VAHXAfiFf134JVm7WopRkif7wAjsb8AsS2sB72UYlkwaJlwL0St5Q08K/5xYzsvS810Do6ZuqDGIb6SOdxiwuBNTtuNUrHga7fjzoY3yHNebSc35rfR4RnVOjhfDAmrJx9a8V9gE1jPM8oBsZXcuYeywDabAuK4D9X+NGfjWsbCWwm6jd+3wZ5R3x7bRH1GFfANOsXuObfuL9Hv8O50rtkPWdCRA/k0zHhBcA057fWo/8+KT+uU9lCquzmIzC1TEo7niONjbYFZnJZia4KviOxIQMH3CN0xGqwPoD+dfYuT23RZ3o0Q+foXVSvaAfw93p98EP+DBLdEGX1xe0cpjLUqPUXDI2XqBlqhPE2AUtgJWztGjfmirENMPmV6gGWGfFgQZjlOCHZZAHu1nS9eXSobYvgRo7R0TKjBvCUGF89+cBGnK61p/dHBiu5+isp0sqOjpzCthZHt/";
            String key = "457E900861A541B7BA69455073A3A56A";
            String iv = "457E900861A541B7";
            String decrypt = AESUtils.decryptAES(text,key,iv);
            Log.e("getDes", "getDes: "+decrypt);
            return decrypt;
        } catch (Exception e) {
            e.printStackTrace();
            return "hello";
        }
    }
}