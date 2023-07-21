package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }
                catch (Exception e){
                    e.printStackTrace();
                    finish();
                }
                finally {
                    Intent i=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i);

                }
            }
        };thread.start();

    }
}