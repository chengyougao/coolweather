package com.example.coolweather.util;

/**
 * Created by gaochengyou on 2015/6/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
