package com.example.user.yourgrade;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mname, mscore;
    private Button mfind, mexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mname = (EditText) findViewById(R.id.n_label);
        mscore = (EditText) findViewById(R.id.s_label);
        mfind = (Button) findViewById(R.id.fine_label);

        mfind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(mname.getText().toString());
                double grade = Double.valueOf(mscore.getText().toString());
                String gradeText = getgrade(grade);

                Intent newgrade = new Intent(MainActivity.this,Grade2.class);
                newgrade.putExtra("name",name);
                startActivity(newgrade);
            }
        });
    }
    private String getgrade(Double grade) {
        String gradeText = "";
        if(grade >=80 ){
            gradeText = "A";
        }else if(grade>=70 && grade<80){
            gradeText = "B";
        }else if(grade>=60 && grade<70){
            gradeText= "C";
        }else if(grade>50 && grade<60){
            gradeText = "C";
        }else{
            gradeText="F";
        }
        return  gradeText;
    }


}

