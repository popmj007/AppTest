package com.xintou.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextView2;
    private TextView mTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.tv);
        mTextView2 = (TextView)findViewById(R.id.login);
        mTextView2 = (TextView)findViewById(R.id.update);
        mTextView.setText("荷兰老婆");
        mTextView2.setText("login");
        mTextView3.setText("update");
    }
}
