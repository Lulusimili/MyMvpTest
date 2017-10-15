package com.example.administrator.mymvptest.HttpUtil;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/10/15 0015.
 */

public class OkHttpUtil {
    public static void sendOkHttpRequest(String url,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
