package com.example.antora.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main9Activity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private CustomAdapter customAdapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private int lastExpandedPosition = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        prepareListData();
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListViewId);
        customAdapter = new CustomAdapter(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapter);

       expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if(lastExpandedPosition != -1 && lastExpandedPosition != groupPosition)
                {
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });  




    }



    public void prepareListData(){

        //getting data frm string xml
        String[] headerString = getResources().getStringArray(R.array.abbreviations_list_header);
        String[] childString = getResources().getStringArray(R.array.abbreviations_list_child);

        //creating list for data header and child
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        //data will come to list by for loop
        for(int i=0;i<headerString.length;i++){
            //adding header data with listDataHeader
            listDataHeader.add(headerString[i]);

            //finding child data

            List<String> child = new ArrayList<>(); //declaring
            child.add(childString[i]); //making list then getting child on it

            listDataChild.put(listDataHeader.get(i),child);





        }


    }
}
