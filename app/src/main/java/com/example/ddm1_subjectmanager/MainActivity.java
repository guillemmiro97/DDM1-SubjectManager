package com.example.ddm1_subjectmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Subject> subjects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subjects.add(new Subject("ASO", R.drawable.asologo, "Administració de Sistemes Operatius"));
        subjects.add(new Subject("PiC", R.drawable.piclogo, "Pensament i Creativitat"));
    }
}