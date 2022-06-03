package com.example.listviewofojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mainListView;
    ArrayList<Student> myStudentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainListView = findViewById(R.id.Mainlist);
        myStudentList.add(new Student("Usman","0","SE",R.drawable.download));
        myStudentList.add(new Student("Saad Bot","1","SE",R.drawable.download));
        myStudentList.add(new Student("11:52","2","SE",R.drawable.download));
        myStudentList.add(new Student("Ahmad","3","SE",R.drawable.download));
        myStudentList.add(new Student("Ahmad","3","SE",R.drawable.download));
        MyAdapter myAdapter = new MyAdapter(this,0,myStudentList);
        mainListView.setAdapter(myAdapter);
    }
}