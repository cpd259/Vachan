package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RL4S11Activity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_pdf1)
    Button btnPdf1;
    @BindView(R.id.btn_pdf2)
    Button btnPdf2;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, RL4S11Activity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl4_s11);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pdf1, R.id.btn_pdf2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pdf1:
                PDFNameUtility.getInstance().setPdf_name("RL4_fluent reading paragraph 9.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf2:
                PDFNameUtility.getInstance().setPdf_name("RL4_lesson plan 11.pdf");
                PDFActivity.launch(this);
                break;
        }
    }
}
