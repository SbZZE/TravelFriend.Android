package com.example.travelfriends.ui.login;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travelfriends.R;

/**
 * @ClassName: RegisterActivity
 * @Description: 用户注册
 * @Author: zly
 * @CreateDate: 2020/5/14 23:29
 */
public class RegisterActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.public_register_layout);
    }
}
