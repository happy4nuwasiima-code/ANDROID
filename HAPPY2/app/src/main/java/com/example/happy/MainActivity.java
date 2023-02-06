package com.example.happy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t1=findViewById(R.id.text2);
        t1=findViewById(R.id.text3);
        t1=findViewById(R.id.text4);
        i1=findViewById(R.id.image);

    }
}