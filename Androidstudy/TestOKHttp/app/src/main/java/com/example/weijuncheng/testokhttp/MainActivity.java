package com.example.weijuncheng.testokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.okhttp.Request;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void excute() throws  Exception{
        Request request = new Request.Builder().url("http://publicobject.com/helloworld.txt").build();
    }
}
