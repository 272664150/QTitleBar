package com.example.qtitlebar.base;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qtitlebar.view.QTitleBar;
import com.example.qtitlebar.R;

public class BaseActivity extends AppCompatActivity {

    private QTitleBar.Builder mTitleBarBuilder;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.activity_base);
        LayoutInflater.from(this).inflate(layoutResID, (ViewGroup) findViewById(R.id.root_content_fl), true);
    }

    /**
     * 获取titleBar构造器，设置相关属性，默认显示back按钮
     */
    protected QTitleBar.Builder getTitleBarBuilder() {
        if (mTitleBarBuilder == null) {
            ViewGroup rootView = getWindow().getDecorView().findViewById(android.R.id.content);
            mTitleBarBuilder = new QTitleBar.Builder(this);
            rootView.addView(mTitleBarBuilder.build());
            mTitleBarBuilder.setLeft1Icon(R.drawable.ic_arrow_back_black_24dp)
                    .setLeft1ClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            finish();
                        }
                    })
                    .setLeft1Visibility(View.VISIBLE);
        }
        return mTitleBarBuilder;
    }
}
