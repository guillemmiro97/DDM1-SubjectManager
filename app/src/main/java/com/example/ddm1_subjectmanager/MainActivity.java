package com.example.ddm1_subjectmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Subject> subjects = new ArrayList<>();
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subjects.add(new Subject("ASO", R.drawable.asologo, "Administració de Sistemes Operatius"));
        subjects.add(new Subject("PiC", R.drawable.piclogo, "Pensament i Creativitat"));

        String names[] = new String[subjects.size()];

        for (int i = 0; i < subjects.size(); i++) {
            names[i] = subjects.get(i).getTitle();
        }

        list = findViewById(R.id.listView);

        ArrayAdapter<String> array = new ArrayAdapter<String>(this,R.layout.activity_listview, R.id.subjectTitle,names);

        list.setAdapter(array);




    }
}