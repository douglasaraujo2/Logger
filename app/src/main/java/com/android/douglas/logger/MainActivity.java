package com.android.douglas.logger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnIniciar,R.id.btnParar})
    public void onInit(View view){
        Intent i = new Intent(this, LoggerService.class);
        if (view.getId() == R.id.btnIniciar){
            startService(i);
        }else {
            stopService(i);
        }


    }

}
