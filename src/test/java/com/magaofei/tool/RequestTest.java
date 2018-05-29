package com.magaofei.tool;

import okhttp3.*;
import org.junit.Test;

import java.io.IOException;

public class RequestTest {


    @Test
    public void run() {
        String url = "http://httpbin.org/post";
        OkHttpClient client = new OkHttpClient();
        RequestBody body = new FormBody.Builder()
                .add("foo", "bar")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .header("foo", "foo")
                .post(body)
                .build();



        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if ( response == null ) {
            return;
        }

        System.out.println(response.body());
        System.out.println(response.message());
        System.out.println(response.headers());



//        return response.body().string();
    }



}
