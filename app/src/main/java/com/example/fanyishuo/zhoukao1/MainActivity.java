package com.example.fanyishuo.zhoukao1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyCustom mycustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mycustom = (MyCustom) findViewById(R.id.mycustom);
        mycustom.setButton1ClickListener(new MyCustom.OnButton1ClickListener() {
            @Override
            public void OnButton1Listener(View button1) {
                Toast.makeText(MainActivity.this,"点击了返回", Toast.LENGTH_SHORT).show();
            }
        });

        mycustom.setButton2ClickListener(new MyCustom.OnButton2ClickListener() {
            @Override
            public void OnButton2Listener(View button2) {
                Toast.makeText(MainActivity.this,"点击了更多", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
