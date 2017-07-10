package com.androidactivity.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClicButtonListener();
    }

    public void OnClicButtonListener() {
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.androidactivity.example.SecondActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
