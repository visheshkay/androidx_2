package com.example.newapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newapp.MyViewHolder;
import com.example.newapp.R;
import com.example.newapp.ui.models.ProjectModel;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<MyViewHolder>{
    List<ProjectModel> projects;
    Context context;

    public Adapter1(List<ProjectModel> projects, Context context) {
        this.projects = projects;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.project_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(projects.get(position).getTitle());
        holder.desc.setText(projects.get(position).getDesc());
        holder.link.setText(projects.get(position).getLink());
        holder.img.setImageResource(projects.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return projects.size();
    }
}
