package com.example.correctweekone.model;

import com.example.correctweekone.OkHttpUtile.OkHttpUtils;
import com.example.correctweekone.api.API;
import com.example.correctweekone.gsonbean.DataEntity;
import com.google.gson.Gson;

import java.util.List;

import javax.security.auth.callback.Callback;

public class DataModel {
    public void getData(OkHttpUtils httpUtils , final Callback callback) {
        httpUtils.getOkHttp(API.API, new OkHttpUtils.OkHttp() {
            @Override
            public void success(String result) {
                DataEntity dataEntity = new Gson().fromJson(result, DataEntity.class);
                List<DataEntity.DataBean> data = dataEntity.getData();
                callback.success(data);
            }

            @Override
            public void defeated() {
                callback.defeated();

            }
        });
    }

    public interface Callback{
        void success(List<DataEntity.DataBean> dataBeans);
        void defeated();
    }
}
