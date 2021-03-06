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

public class RL3S9Activity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_pdf1)
    Button btnPdf1;
    @BindView(R.id.btn_pdf2)
    Button btnPdf2;
    @BindView(R.id.btn_pdf3)
    Button btnPdf3;
    @BindView(R.id.btn_pdf4)
    Button btnPdf4;
    @BindView(R.id.btn_pdf5)
    Button btnPdf5;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, RL3S9Activity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl3_s9);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pdf1, R.id.btn_pdf2, R.id.btn_pdf3, R.id.btn_pdf4, R.id.btn_pdf5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pdf1:
                PDFNameUtility.getInstance().setPdf_name("RL3_I_Sapshidi.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf2:
                PDFNameUtility.getInstance().setPdf_name("RL3_lesson plan 9.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf3:
                PDFNameUtility.getInstance().setPdf_name("RL3_shrutalekhan 9.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf4:
                PDFNameUtility.getInstance().setPdf_name("RL3_W_3.14.pdf");
                PDFActivity.launch(this);
                break;
            case R.id.btn_pdf5:
                PDFNameUtility.getInstance().setPdf_name("RL3_W_3.15.pdf");
                PDFActivity.launch(this);
                break;
        }
    }
}
