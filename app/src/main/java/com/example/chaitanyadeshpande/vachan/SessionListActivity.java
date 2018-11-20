package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;

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

    public static void launch(Context context) {
        context.startActivity(new Intent(context, SessionListActivity.class));
    }


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
                if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl1")){

                    RL1S7Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl2")){

                    RL2S7Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl3")){

                    RL3S7Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl4")){

                    RL4S7Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl5")){

                    RL5S7Activity.launch(this);

                }
                break;
            case R.id.ll_session8:
                if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl1")){

                    RL1S8Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl2")){

                    RL2S8Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl3")){
                    RL3S8Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl4")){
                    RL4S8Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl5")){

                    RL5S8Activity.launch(this);

                }
                break;
            case R.id.ll_session9:
                if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl1")){

                    RL1S9Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl2")){
                    RL2S9Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl3")){
                    RL3S9Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl4")){
                    RL4S9Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl5")){
                    RL5S9Activity.launch(this);

                }
                break;
            case R.id.ll_session10:
                if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl1")){

                    RL1S10Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl2")){
                    RL2S10Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl3")){
                    RL3S10Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl4")){
                    RL4S10Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl5")){
                    RL5S10Activity.launch(this);

                }
                break;
            case R.id.ll_session11:
                if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl1")){
                    RL1S11Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl2")){
                    RL2S11Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl3")){
                    RL3S11Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl4")){
                    RL4S11Activity.launch(this);

                }else if(ReadingLevelSelectionUtility.getInstance().getReadingLevel()
                        .equalsIgnoreCase("rl5")){
                    RL5S11Activity.launch(this);

                }
                break;
        }
    }
}
