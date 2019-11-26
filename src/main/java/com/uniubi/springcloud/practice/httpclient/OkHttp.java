package com.uniubi.springcloud.practice.httpclient;

import okhttp3.*;

import java.io.IOException;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/16
 * @Description:
 */
public class OkHttp {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    public static String run(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();
        System.out.println(client.newCall(request).execute());
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    String bowlingJson(String player1, String player2) {
        return "{'winCondition':'HIGH_SCORE',"
                + "'name':'Bowling',"
                + "'round':4,"
                + "'lastSaved':1367702411696,"
                + "'dateStarted':1367702378785,"
                + "'players':["
                + "{'name':'" + player1 + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
                + "{'name':'" + player2 + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
                + "]}";
    }

}
