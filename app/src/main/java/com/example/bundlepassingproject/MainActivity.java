package com.example.bundlepassingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1;
        btn1=findViewById(R.id.btn1);
        Intent next;
        next=new Intent(MainActivity.this,MainActivity2.class);
        next.putExtra("title","Home");
        next.putExtra("name","Shakil Rana");
        next.putExtra("roll",1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(next);
            }
        });
    }
}