package com.example.qtitlebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qtitlebar.base.BaseFragment;

public class FragmentOne extends BaseFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getTitleBarBuilder().setTitleText("FragmentOne")
                .build()
                .setVisibility(View.VISIBLE);
        view.findViewById(R.id.text_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getActivity(), TwoActivity.class));
    }
}
