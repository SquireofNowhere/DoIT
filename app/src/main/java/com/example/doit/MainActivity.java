package com.example.doit;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doit.Adapter.ToDoAdapter;
import com.example.doit.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView tasksRecyclerView;
    private ToDoAdapter taskAdapter;

    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        taskList = new ArrayList<>();

        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        taskAdapter = new ToDoAdapter(this);
        tasksRecyclerView.setAdapter(taskAdapter);

        ToDoModel task = new ToDoModel();

        task.setTask("This is a dummy task #" + 1);
        task.setStatus(0);
        task.setId(0);
        taskList.add(task);

/*
        for (int i = 1; i <= 5; i++) {
            task.setTask("This is a dummy task #" + i);
            if (i%2 == 0)
                task.setStatus(0);
            else task.setStatus(2);
            task.setId(i);
            taskList.add(task);
        } */

        taskAdapter.setTasks(taskList);


    }
}