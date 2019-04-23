package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class SelectLesson extends AppCompatActivity implements View.OnClickListener{
    private TextView btnLesson1;
    private TextView btnLesson2;
    private TextView btnLesson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lesson);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.select_lesson_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnLesson1 = (TextView) findViewById(R.id.txt_lesson1_back);
        btnLesson2 = (TextView) findViewById(R.id.txt_lesson2_back);
        btnLesson3 = (TextView) findViewById(R.id.txt_lesson3_back);

        btnLesson1.setOnClickListener(this);
        btnLesson2.setOnClickListener(this);
        btnLesson3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SelectLesson.this, SelectChapter.class);
        startActivity(intent);

    }
}

