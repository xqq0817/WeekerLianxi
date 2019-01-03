package com.example.correctweekone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.correctweekone.adapter.Adapter;
import com.example.correctweekone.gsonbean.DataEntity;
import com.example.correctweekone.presenter.DataPresenter;
import com.example.correctweekone.view.DataView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DataView {

    private RecyclerView main_recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //数据
        initData();
        //视图
        initView();
    }
    //视图
    private void initView() {
        main_recyclerView = findViewById(R.id.main_recyclerView);
        //适配器
        adapter = new Adapter(MainActivity.this);
        main_recyclerView.setAdapter(adapter);
        //设置布局
        main_recyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }
    //数据
    private void initData() {
        new DataPresenter().onCreate(this).loadData();
    }

    @Override
    public void success(List<DataEntity.DataBean> dataBeans) {
        adapter.setData(dataBeans);
    }

    @Override
    public void defeated() {

    }
}
