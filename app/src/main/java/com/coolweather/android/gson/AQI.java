package com.coolweather.android.gson;

/**
 * Created by xiaoqianwei on 2021/1/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
