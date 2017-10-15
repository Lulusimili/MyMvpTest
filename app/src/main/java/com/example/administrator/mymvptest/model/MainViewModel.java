package com.example.administrator.mymvptest.model;


import com.example.administrator.mymvptest.HttpUtil.OkHttpUtil;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class MainViewModel implements IMainViewModel {
       String  string_responce;
    @Override
    public String getResponse() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client=new OkHttpClient();
                    Request request=new Request.Builder()
                            .url("https://www.baidu.com")
                            .build();
                    Response response=client.newCall(request).execute();
                    String responceData=response.body().string();
                    string_responce=responceData;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
        return string_responce;
    }
}
