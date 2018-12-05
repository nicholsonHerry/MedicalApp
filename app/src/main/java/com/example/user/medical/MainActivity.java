package com.example.user.medical;

import  android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button Guest;  //宣告Button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Guest=(Button) findViewById(R.id.Guest); //變數連接Button



        Button BtnSecondPage=(Button)findViewById(R.id.Guest);
        BtnSecondPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);  //從MainActivity連接到MainActivity2
                startActivity(intent);
            }
        });
    }
}
