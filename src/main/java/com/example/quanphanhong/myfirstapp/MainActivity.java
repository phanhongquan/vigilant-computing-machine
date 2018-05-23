package com.example.quanphanhong.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView content;
    private TextView button;
    private int check = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = (TextView) findViewById(R.id.tv);
        button = (Button) findViewById(R.id.btn);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check == 1) {
                    content.setText("Hello");
                    check = 0;
                } else {
                    content.setText("Hi");
                    check = 1;
                }
            }
        };
        button.setOnClickListener(listener);
    }
}
