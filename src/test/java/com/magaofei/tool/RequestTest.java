package com.magaofei.tool;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.springframework.scheduling.annotation.Async;

import java.io.IOException;

public class RequestTest {


    @Test
    public void run() throws IOException {
        String url = "http://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());
        System.out.println(response.headers());
//        return response.body().string();
    }



}
