package com.example.antora.splash;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main10Activity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score,question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        r = new Random();

        answer1 = (Button)findViewById(R.id.answer1);
        answer2 = (Button)findViewById(R.id.answer2);
        answer3 = (Button)findViewById(R.id.answer3);
        answer4 = (Button)findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score : "+ mScore);

        updateQuestion(r.nextInt(mQuestionLength));


        //ans1
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else {
                    quizOver();
                }

            }
        });


        //ans2
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else {
                    quizOver();
                }

            }
        });

        //ans3
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else {
                    quizOver();
                }
            }
        });

        //ans4
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else {
                    quizOver();
                }
            }
        });

    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));

        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);

    }
    private void quizOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main10Activity.this);
        alertDialogBuilder
                .setMessage("Quiz Over!Your score is :"+mScore+" points!!!")
                .setCancelable(false)
                .setPositiveButton("New Quiz",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),Main10Activity.class));
                                finish();
                            }
                        })

                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();



    }
}
