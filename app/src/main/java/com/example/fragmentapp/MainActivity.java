package com.example.fragmentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Task> taskList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
//        taskList.add(new Task("Project 4", "Aplikasi web udah running di server", "Tinggi", new Date(2020, 3, 3)));
//        taskList.add(new Task("APSI", "SOP diperbaiki", "Menengah", new Date(2020, 3, 4)));
//        taskList.add(new Task("PPL", "Refactor class diagram", "Tinggi", new Date(2020, 3,5)));
        taskList = init();
        taskAdapter = new TaskAdapter(taskList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(taskAdapter);
    }

    private ArrayList<Task> init(){
        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task("Project 4", "Aplikasi web udah running di server", "Tinggi", new Date(2020, 3, 3)));
        list.add(new Task("APSI", "SOP diperbaiki", "Menengah", new Date(2020, 3, 4)));
        list.add(new Task("PPL", "Refactor class diagram", "Tinggi", new Date(2020, 3,5)));

        return list;
    }

}
