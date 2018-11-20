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

public class RL1S8Activity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_pdf1)
    Button btnPdf1;
    @BindView(R.id.btn_pdf2)
    Button btnPdf2;
    @BindView(R.id.btn_pdf3)
    Button btnPdf3;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, RL1S8Activity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl1_s8);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pdf1, R.id.btn_pdf2, R.id.btn_pdf3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pdf1:
                PDFNameUtility.getInstance().setPdf_name("RL1_lesson plan 8.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf2:
                PDFNameUtility.getInstance().setPdf_name("RL1_S_chamchamit faral.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf3:
                PDFNameUtility.getInstance().setPdf_name("RL1_S_chamchamit faral_shabdyadi.pdf");
                PDFActivity.launch(this);
                break;
        }
    }
}
