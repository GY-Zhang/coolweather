package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Mr.zhang on 2016/12/7.
 */

public class Country extends DataSupport {

    private int id;
    private String cooutryName;
    private int weahterId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCooutryName() {
        return cooutryName;
    }

    public void setCooutryName(String cooutryName) {
        this.cooutryName = cooutryName;
    }

    public int getWeahterId() {
        return weahterId;
    }

    public void setWeahterId(int weahterId) {
        this.weahterId = weahterId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
