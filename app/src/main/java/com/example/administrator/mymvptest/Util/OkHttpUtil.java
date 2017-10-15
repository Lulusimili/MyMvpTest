package com.example.administrator.mymvptest.Util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class OkHttpUtil {
    public static void sendOkHttpRequest(final String address,
                                        okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
