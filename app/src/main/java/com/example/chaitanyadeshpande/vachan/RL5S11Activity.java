package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RL5S11Activity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_pdf1)
    Button btnPdf1;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, RL5S11Activity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl5_s11);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_pdf1)
    public void onViewClicked() {
        PDFNameUtility.getInstance().setPdf_name("RL5_ lesson plan 11.pdf");
        PDFActivity.launch(this);
    }
}
