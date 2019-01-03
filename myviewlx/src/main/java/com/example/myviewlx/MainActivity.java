package com.example.myviewlx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;
    private MyView myview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取资源ID
        layout = findViewById(R.id.layout);
        myview = findViewById(R.id.myview);

        myview.invalidate();//重绘，直接触发onDraw()方法，只能在主线程通知重绘
        myview.postInvalidate();//重绘，直接触发onDraw()方法，面试题，区别，子线程可以通知重绘
    }
}
