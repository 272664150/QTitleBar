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

        getTitleBarBuilder()
                .setTitleText("ActivityTitle")
                .setLeft1Text("左1")
                .setLeft2Icon(R.drawable.ic_arrow_back_black_24dp)
                .setLeft2Text("左2")
                .setLeft2Visibility(View.VISIBLE)
                .setRight1Icon(R.drawable.ic_format_list_bulleted_black_24dp)
                .setRight1Text("右1")
                .setRight1Visibility(View.VISIBLE)
                .setRight2Icon(R.drawable.ic_format_list_bulleted_black_24dp)
                .setRight2Text("右2")
                .setRight2Visibility(View.VISIBLE);
        findViewById(R.id.text_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, OneActivity.class));
    }
}
