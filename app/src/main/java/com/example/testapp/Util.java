package com.example.testapp;

import com.example.testapp.model.Rating;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class Util {

    public static Rating[] getRatings(URL url) throws IOException {

        Gson gson = new Gson();
        URLConnection urlConnection = url.openConnection();
        InputStream ins = urlConnection.getInputStream();
        Reader reader = new InputStreamReader(ins);
        return gson.fromJson(reader, Rating[].class);
    }
}
