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

public class RL1S11Activity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_pdf1)
    Button btnPdf1;
    @BindView(R.id.btn_pdf2)
    Button btnPdf2;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, RL1S11Activity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl1_s11);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pdf1, R.id.btn_pdf2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pdf1:
                PDFNameUtility.getInstance().setPdf_name("RL1_lesson plan 11.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf2:
                PDFNameUtility.getInstance().setPdf_name("RL1_R_shrutalekhan shabd 2.pdf");
                PDFActivity.launch(this);
                break;
        }
    }
}
