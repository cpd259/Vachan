package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

public class MainActivity extends AppCompatActivity implements OnPageChangeListener {

    Button buttonNext;
    PDFView pdfView;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_pdf);
//        buttonNext = findViewById(R.id.next);
        pdfView = findViewById(R.id.pdfview);
//        buttonNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(intent);
//            }
//        });

        pdfView.fromAsset(PDFNameUtility.getInstance().getPdf_name())
                .defaultPage(1)
                .showMinimap(true)
                .enableSwipe(true)
//                .onDraw(onDrawListener)
//                .onLoad(onLoadCompleteListener)
//                .onPageChange(onPageChangeListener)
                .load();


    }

    @Override
    public void onPageChanged(int page, int pageCount) {

    }
}
