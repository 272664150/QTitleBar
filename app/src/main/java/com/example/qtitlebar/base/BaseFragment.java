package com.example.qtitlebar.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.example.qtitlebar.view.QTitleBar;
import com.example.qtitlebar.R;

public class BaseFragment extends Fragment {

    private QTitleBar.Builder mTitleBarBuilder;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mTitleBarBuilder == null) {
            mTitleBarBuilder = new QTitleBar.Builder(getActivity());
            mTitleBarBuilder.setLeft1Icon(R.drawable.ic_arrow_back_black_24dp)
                    .setLeft1ClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            getActivity().onBackPressed();
                        }
                    })
                    .setLeft1Visibility(View.VISIBLE)
                    .build()
                    .setVisibility(View.GONE);

            if (!(view instanceof ViewGroup) || view instanceof ScrollView) {
                return;
            }

            ((ViewGroup) view).removeView(mTitleBarBuilder.build());
            if (view instanceof LinearLayout) {
                ((ViewGroup) view).addView(mTitleBarBuilder.build(), 0);
            } else if (view instanceof FrameLayout || view instanceof RelativeLayout) {
                ((ViewGroup) view).addView(mTitleBarBuilder.build());
            }
        }
    }

    /**
     * 获取titleBar构造器，设置相关属性，默认显示back按钮
     */
    public QTitleBar.Builder getTitleBarBuilder() {
        return mTitleBarBuilder;
    }
}
