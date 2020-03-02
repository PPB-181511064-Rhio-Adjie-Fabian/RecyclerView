package com.example.fragmentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ListViewHolder> {
    private ArrayList<Task> taskList;

    public TaskAdapter(ArrayList<Task> list){
        this.taskList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.title.setText(task.getTitleTugs());
        holder.detail.setText(task.getDetailTugas());
        holder.deadline.setText(task.getDeadLineTugas().toString());
//        holder.level.setText(task.getLevelTugas());
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView title, detail, deadline, level;
        public ListViewHolder(@NonNull  View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.title);
            detail = itemView.findViewById(R.id.detail);
            deadline = itemView.findViewById(R.id.deadline);
        }
    }
}
