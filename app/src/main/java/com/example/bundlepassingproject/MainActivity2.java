package com.example.bundlepassingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent getinfo;
        getinfo=getIntent();
        String title=getinfo.getStringExtra("title");
        String name=getinfo.getStringExtra("name");
        int roll=getinfo.getIntExtra("roll",0);

        TextView txt;
        txt=findViewById(R.id.txt);
        txt.setText("Roll:"+roll+",  Name:"+name);
        getSupportActionBar().setTitle(title);

    }
}