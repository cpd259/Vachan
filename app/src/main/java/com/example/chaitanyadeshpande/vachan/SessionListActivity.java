package com.example.chaitanyadeshpande.vachan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SessionListActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ll_session7)
    LinearLayout llSession7;
    @BindView(R.id.ll_session8)
    LinearLayout llSession8;
    @BindView(R.id.ll_session9)
    LinearLayout llSession9;
    @BindView(R.id.ll_session10)
    LinearLayout llSession10;
    @BindView(R.id.ll_session11)
    LinearLayout llSession11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_list);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_session7, R.id.ll_session8, R.id.ll_session9, R.id.ll_session10, R.id.ll_session11})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_session7:
                break;
            case R.id.ll_session8:
                break;
            case R.id.ll_session9:
                break;
            case R.id.ll_session10:
                break;
            case R.id.ll_session11:
                break;
        }
    }
}
