package com.example.newapp.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newapp.R;
import com.example.newapp.databinding.FragmentDashboardBinding;
import com.example.newapp.ui.Adapter1;
import com.example.newapp.ui.models.ProjectModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<ProjectModel> projects = new ArrayList<>();
        projects.add(new ProjectModel(R.drawable.ic_launcher_background,"project","sadfasdf","https:/gooogle.cioshn"));
        RecyclerView rv = root.findViewById(R.id.recyclerview1);
        rv.setLayoutManager(new LinearLayoutManager(root.getContext()));
        rv.setAdapter(new Adapter1(projects,getContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}