package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReadingLevelListActivity extends AppCompatActivity {

    @BindView(R.id.cv1)
    CardView cv1;
    @BindView(R.id.cv2)
    CardView cv2;
    @BindView(R.id.cv3)
    CardView cv3;
    @BindView(R.id.cv4)
    CardView cv4;
    @BindView(R.id.cv5)
    CardView cv5;

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






        if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Gauri Dev")) {
                cv1.setVisibility(View.VISIBLE);
                cv2.setVisibility(View.GONE);
                cv3.setVisibility(View.VISIBLE);
                cv4.setVisibility(View.GONE);
                cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Ashwini Chavan")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Jayashri Mandke")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Revati Warle")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Vaishali Athalye")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Pradnya Wagh")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Tanvi Divekar")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Madhuri Baviskar")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Swati Fadke")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Aishwarya Gadgil")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Gauri Patki")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Bhavana Thorat")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.GONE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Manasi Apte")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Archana Thakur")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Neha Kshirsagar")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Pinanki Barge")) {
            cv1.setVisibility(View.GONE);
            cv2.setVisibility(View.GONE);
            cv3.setVisibility(View.GONE);
            cv4.setVisibility(View.GONE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Manasi Kokil")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Rahul Kokil")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.VISIBLE);
        }else if (UserNameUtility.getInstance().getUserName().equalsIgnoreCase("Swarali Gokhale")) {
            cv1.setVisibility(View.VISIBLE);
            cv2.setVisibility(View.VISIBLE);
            cv3.setVisibility(View.VISIBLE);
            cv4.setVisibility(View.VISIBLE);
            cv5.setVisibility(View.VISIBLE);
        }


    }

    @OnClick({R.id.ll_rl1, R.id.ll_rl2, R.id.ll_rl3, R.id.ll_rl4, R.id.ll_rl5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_rl1:
                ReadingLevelSelectionUtility.getInstance().setReadingLevel("rl1");
                SessionListActivity.launch(this);
                break;
            case R.id.ll_rl2:
                ReadingLevelSelectionUtility.getInstance().setReadingLevel("rl2");
                SessionListActivity.launch(this);
                break;
            case R.id.ll_rl3:
                ReadingLevelSelectionUtility.getInstance().setReadingLevel("rl3");
                SessionListActivity.launch(this);
                break;
            case R.id.ll_rl4:
                ReadingLevelSelectionUtility.getInstance().setReadingLevel("rl4");
                SessionListActivity.launch(this);
                break;
            case R.id.ll_rl5:
                ReadingLevelSelectionUtility.getInstance().setReadingLevel("rl5");
                SessionListActivity.launch(this);
                break;
        }
    }
}
