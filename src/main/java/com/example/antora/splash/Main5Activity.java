package com.example.antora.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("file.pdf").load();
    }
}
