package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LessonPlanListActivity extends AppCompatActivity {

    @BindView(R.id.btn_assign1)
    Button btnAssign1;
    @BindView(R.id.btn_assign2)
    Button btnAssign2;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, LessonPlanListActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_plan_list);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_assign1, R.id.btn_assign2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_assign1:
                PDFNameUtility.getInstance().setPdf_name("rl4_Lesson_plan_4.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_assign2:
                PDFNameUtility.getInstance().setPdf_name("rl4_lesson_plan_5.pdf");
                PDFActivity.launch(this);
                break;
        }
    }
}
