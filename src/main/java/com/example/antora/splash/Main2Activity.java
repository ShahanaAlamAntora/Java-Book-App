package com.example.antora.splash;

import android.app.ProgressDialog;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static java.lang.Thread.sleep;

public class Main2Activity extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private int progressPercentage = 0;

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnStart = (Button)findViewById(R.id.btnStart);


        //adding back button to the tool bar

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnStart.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                final Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                progressDialog = new ProgressDialog(v.getContext());
                progressDialog.setMessage("Preparing.....");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.setProgress(0);
                progressDialog.setMax(100);
                progressDialog.show();



                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressPercentage < 100) {
                            try {

                                sleep(50);

                                progressPercentage++;

                                progressDialog.setProgress(progressPercentage);

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        progressDialog.dismiss();
                   startActivity(intent);

                    }

                }).start();

            }
        });


 }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)  //default id match ,back to
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
