package com.example.ddm1_subjectmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectActivity extends AppCompatActivity {

    ImageView logo;
    TextView tvTitle, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        Intent i = getIntent();
        Subject subject = (Subject) i.getSerializableExtra("subject");

        logo = findViewById(R.id.subjectLogo);
        logo.setImageResource(subject.getLogoImage());

        tvTitle = findViewById(R.id.subjectTitleSA);
        tvTitle.setText(subject.getTitle());

        tvDescription = findViewById(R.id.subjectDescriptionSA);
        tvDescription.setText(subject.getDescription());
    }
}