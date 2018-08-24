package com.example.chaitanyadeshpande.vachan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RL1S7Activity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl1_s7);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pdf1, R.id.btn_pdf2, R.id.btn_pdf3, R.id.btn_pdf4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pdf1:
                break;
            case R.id.btn_pdf2:
                break;
            case R.id.btn_pdf3:
                break;
            case R.id.btn_pdf4:
                break;
        }
    }
}
