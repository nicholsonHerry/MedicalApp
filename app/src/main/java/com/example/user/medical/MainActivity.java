package com.example.user.medical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button GuestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GuestBtn=(Button)findViewById(R.id.GuestBtn);


        Button btn1=(Button)findViewById(R.id.GuestBtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,MainSelectionActivity.class);
                startActivity(intent);
            }
        });

        //11111
        //666666
        //123;
    }
}
