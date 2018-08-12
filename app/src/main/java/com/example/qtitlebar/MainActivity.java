package com.example.qtitlebar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.qtitlebar.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTitleBarBuilder().setTitleText("TitleBar of Activity");
        findViewById(R.id.text_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, OneActivity.class));
    }
}
