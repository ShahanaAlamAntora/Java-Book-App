package com.example.antora.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewQues);

        pdfView.fromAsset("question.pdf").load();
    }
}
