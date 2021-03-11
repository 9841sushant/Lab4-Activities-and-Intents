package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView ShowCount;
    private TextView HelloMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ShowCount=findViewById(R.id.txtCount);
        HelloMsg=findViewById(R.id.txtHello);
        Intent intent=getIntent();
        String message=intent.getStringExtra("MSG");
        int count=intent.getIntExtra("COUNT",0);
        HelloMsg.setText(message);
        ShowCount.setText(""+count);




    }
    public static Intent makeIntent(Context context,  String msg,int data){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("MSG",msg);
        intent.putExtra("COUNT",data);


        return intent;
    }
}