package com.example.hasee.googleplay.view;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasee.googleplay.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActionBar();
    }

    private void initActionBar() {
        //得到actionBar实例
        ActionBar supportActionBar = getSupportActionBar();

        //设置标题
        supportActionBar.setTitle("主标题");
        supportActionBar.setSubtitle("副标题");

        //设置图标
        supportActionBar.setIcon(R.drawable.ic_launcher);
        supportActionBar.setLogo(R.mipmap.ic_action_call);

        //显示logo/icon（图标）
        supportActionBar.setDisplayShowHomeEnabled(true);//默认都是false，
        //修改icon和logo显示的优先级
        supportActionBar.setDisplayUseLogoEnabled(true);//默认用到时icon，没用logo
        //显示回退部分
        supportActionBar.setDisplayHomeAsUpEnabled(true);//
    }
}
