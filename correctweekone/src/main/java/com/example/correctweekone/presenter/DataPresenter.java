package com.example.correctweekone.presenter;

import com.example.correctweekone.MainActivity;
import com.example.correctweekone.OkHttpUtile.OkHttpUtils;
import com.example.correctweekone.gsonbean.DataEntity;
import com.example.correctweekone.model.DataModel;
import com.example.correctweekone.view.DataView;

import java.util.List;

public class DataPresenter {
    private DataView mView;

    public DataPresenter onCreate(DataView view) {
        this.mView=view;
        return this;
    }
    public void loadData(){
        new DataModel().getData(OkHttpUtils.getInstance(), new DataModel.Callback() {
            @Override
            public void success(List<DataEntity.DataBean> dataBeans) {
                mView.success(dataBeans);
            }

            @Override
            public void defeated() {
                mView.defeated();
            }
        });
    }
}
