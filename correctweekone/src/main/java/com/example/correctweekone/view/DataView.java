package com.example.correctweekone.view;

import com.example.correctweekone.gsonbean.DataEntity;

import java.util.List;

public interface DataView {
    //成功
    void success(List<DataEntity.DataBean> dataBeans);
    //失败
    void defeated();
}
