package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class SelectMode extends AppCompatActivity implements View.OnClickListener{

    private TextView btnSerchName;
    private TextView btnRandomOpp;
    private TextView btnRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.select_mode_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnSerchName = (TextView) findViewById(R.id.txt_serchname_back);
        btnRandomOpp = (TextView) findViewById(R.id.txt_randraghib_back);
        btnRobot = (TextView) findViewById(R.id.txt_robot_bac);

        btnSerchName.setOnClickListener(this);
        btnRandomOpp.setOnClickListener(this);
        btnRobot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){

            case R.id.txt_serchname_back:
                intent=new Intent(SelectMode.this, Serch.class);
                startActivity(intent);
                break;

            case R.id.txt_randraghib_back:
                intent=new Intent(SelectMode.this, SelectLesson.class);
                startActivity(intent);
                break;

            case R.id.txt_robot_bac:
                intent=new Intent(SelectMode.this, SelectLesson.class);
                startActivity(intent);
                break;
        }

    }
}
