package com.example.android.doanything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int num[]={0,1,2,3,4,5}; // int[] num    and    int num[]  both are same but int[] num is preferred.
        for(int i=0;i<num.length;i++) {
            Log.v("LogExample", String.valueOf(num[i]));
        }



    }



}
