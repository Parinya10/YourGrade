package com.example.user.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Grade2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String gradetext = intent.getStringExtra("grade");
        TextView text = (TextView)findViewById(R.id.textView2);
        TextView text2 = (TextView)findViewById(R.id.textView3);
    }
}
