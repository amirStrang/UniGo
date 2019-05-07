package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class EndActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView btnExit;
    private TextView btnPlay;
    private TextView txtOppSc3;
    private TextView txtYourSc3;


    private int REQUEST_CODE = 123;
    private boolean gameEnd;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra("endGame")) {
                if(data.getExtras().getBoolean("endGame"))
                    gameEnd = true;
            }
        }

        if(gameEnd){
            btnPlay.setVisibility(View.GONE);
            btnExit.setVisibility(View.VISIBLE);

            txtYourSc3.setText("5");
            txtOppSc3.setText("2");

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.end_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnExit = (TextView) findViewById(R.id.btn_exit);
        btnPlay = (TextView) findViewById(R.id.btn_play);
        txtOppSc3 = (TextView) findViewById(R.id.txt_oppScore3);
        txtYourSc3 = (TextView) findViewById(R.id.txt_yourScore3);

        btnPlay.setOnClickListener(this);
        btnExit.setOnClickListener(this);

        gameEnd = false;


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_exit:
                Intent intent = new Intent(EndActivity.this, SelectMode.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btn_play:
                Intent intent2 = new Intent(EndActivity.this, Play.class);
                startActivityForResult(intent2, REQUEST_CODE);
                break;
        }

    }
}
