package com.example.antora.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView gridView;

    String[] values = {

            "Tuitorial",
            "Code",
            "Viva",
            "Youtube",
            "Abbreviation",
            "Quiz"


    };

    int[] images = {
            R.drawable.ttuitorial,
            R.drawable.code,
            R.drawable.viva,
            R.drawable.youtube,
            R.drawable.abbreviation,
            R.drawable.quiz,
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        gridView =(GridView)findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(this ,values ,images);

        gridView.setAdapter((ListAdapter) gridAdapter);


     //  gridView.setAdapter(new GridAdapter(this));
       gridView.setOnItemClickListener(this);




    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String value =values [position];
        Toast.makeText(Main4Activity.this,value,Toast.LENGTH_SHORT).show();


        switch (position){

            case 0:
                Intent intent=new Intent(this,Main5Activity.class);
                startActivity(intent);
                break;

            case 1:
                Intent intent1=new Intent(this,Main6Activity.class);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2=new Intent(this,Main7Activity.class);
                startActivity(intent2);
                break;

            case 3:
                Intent intent3=new Intent(this,Main8Activity.class);
                startActivity(intent3);
                break;

            case 4:
                Intent intent4=new Intent(this,Main9Activity.class);
                startActivity(intent4);
                break;

            case 5:
                Intent intent5=new Intent(this,Main10Activity.class);
                startActivity(intent5);
                break;


        }


    }
}





