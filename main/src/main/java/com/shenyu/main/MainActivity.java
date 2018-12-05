package com.shenyu.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_rocket).setOnClickListener(v -> {
            ARouter.getInstance().build("/StarRocket/activity").navigation();});

        findViewById(R.id.btn_happy_orb).setOnClickListener(v ->{
                ARouter.getInstance().build("/HappyOrb/activity").navigation();});
    }
}
