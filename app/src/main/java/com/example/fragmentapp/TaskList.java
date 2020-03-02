package com.example.fragmentapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TaskList {
    private static ArrayList<Task> taskList = new ArrayList<>();

    public TaskList(ArrayList<Task> inputTask){
        taskList = inputTask;
    }

    public TaskList() {}

    public static ArrayList<Task> getTaskList(){
        Task task = new Task("Project 4", "Aplikasi web udah running di server", "Tinggi", new Date(2020, 3, 3));
        taskList.add(task);
        task = new Task("APSI", "SOP diperbaiki", "Menengah", new Date(2020, 3, 4));
        taskList.add(task);
        task = new Task("PPL", "Refactor class diagram", "Tinggi", new Date(2020, 3, 5));
        taskList.add(task);
        return taskList;
    }

}
