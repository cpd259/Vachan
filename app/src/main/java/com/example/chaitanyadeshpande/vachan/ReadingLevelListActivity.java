package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReadingLevelListActivity extends AppCompatActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, ReadingLevelListActivity.class));
    }


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ll_rl1)
    LinearLayout llRl1;
    @BindView(R.id.ll_rl2)
    LinearLayout llRl2;
    @BindView(R.id.ll_rl3)
    LinearLayout llRl3;
    @BindView(R.id.ll_rl4)
    LinearLayout llRl4;
    @BindView(R.id.ll_rl5)
    LinearLayout llRl5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_level_list);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_rl1, R.id.ll_rl2, R.id.ll_rl3, R.id.ll_rl4, R.id.ll_rl5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_rl1:
                break;
            case R.id.ll_rl2:
                break;
            case R.id.ll_rl3:
                break;
            case R.id.ll_rl4:
                break;
            case R.id.ll_rl5:
                break;
        }
    }
}
