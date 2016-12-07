package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Mr.zhang on 2016/12/7.
 */

public class Province extends DataSupport{

    private int id;
    private String ProvinceName;
    private int provinceCode;

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
