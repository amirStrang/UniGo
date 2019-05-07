package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.eaglet.unigo.R;

public class SelectChapter extends AppCompatActivity implements View.OnClickListener{
    private Button btnCh1;
    private Button btnCh2;
    private Button btnCh3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_chapter);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.select_chapter_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnCh1 = (Button) findViewById(R.id.btn_chapter1);
        btnCh2 = (Button) findViewById(R.id.btn_chapter2);
        btnCh3 = (Button) findViewById(R.id.btn_chapter3);

        btnCh1.setOnClickListener(this);
        btnCh2.setOnClickListener(this);
        btnCh3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SelectChapter.this, EndActivity.class);
        startActivity(intent);

    }
}
