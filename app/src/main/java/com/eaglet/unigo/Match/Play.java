package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.Group;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class Play extends AppCompatActivity implements View.OnClickListener{

    private Button btnGozine1;
    private Button btnGozine2;
    private Button btnGozine3;
    private Button btnGozine4;
    private Button btnContinue;
    private Button btnWasEasy;
    private Button btnWasHard;
    private Button btnAddAnbar;
    private Button btnReportQ;

    private Group goNextGp;
    private Group playGp;
    private TextView buyTime;
    private TextView timeRecBorder;
    private TextView timeRec;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.play_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnGozine1 = (Button) findViewById(R.id.btn_gozine1);
        btnGozine2 = (Button) findViewById(R.id.btn_gozine2);
        btnGozine3 = (Button) findViewById(R.id.btn_gozine3);
        btnGozine4 = (Button) findViewById(R.id.btn_gozine4);
        buyTime = (TextView) findViewById(R.id.buy_time_rec);
        timeRec = (TextView) findViewById(R.id.time_rec);
        timeRecBorder = (TextView) findViewById(R.id.time_rec_border);

        btnContinue = (Button) findViewById(R.id.btn_continue);
        btnReportQ = (Button) findViewById(R.id.btn_report);
        btnAddAnbar = (Button) findViewById(R.id.btn_add_anbar);
        btnWasEasy = (Button) findViewById(R.id.btn_was_easy);
        btnWasHard = (Button) findViewById(R.id.btn_was_hard);

        goNextGp = (Group) findViewById(R.id.go_next_group);
        playGp = (Group) findViewById(R.id.play_group);

        btnGozine1.setOnClickListener(this);
        btnGozine2.setOnClickListener(this);
        btnGozine3.setOnClickListener(this);
        btnGozine4.setOnClickListener(this);

        btnContinue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_continue) {
            Intent intent = new Intent(Play.this, EndActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            int animationTime = 200;
            Animation fadeIn = new AlphaAnimation(0, 1);
            fadeIn.setInterpolator(new DecelerateInterpolator());
            fadeIn.setStartOffset(animationTime);
            fadeIn.setDuration(animationTime);

            Animation fadeOut = new AlphaAnimation(1, 0);
            fadeOut.setInterpolator(new AccelerateInterpolator());
            fadeOut.setDuration(animationTime);

            btnGozine1.startAnimation(fadeOut);
            btnGozine2.startAnimation(fadeOut);
            btnGozine3.startAnimation(fadeOut);
            btnGozine4.startAnimation(fadeOut);
            buyTime.startAnimation(fadeOut);
            timeRecBorder.startAnimation(fadeOut);
            timeRec.startAnimation(fadeOut);

            playGp.setVisibility(View.GONE);
            goNextGp.setVisibility(View.VISIBLE);

            btnContinue.startAnimation(fadeIn);
            btnAddAnbar.startAnimation(fadeIn);
            btnReportQ.startAnimation(fadeIn);
            btnWasHard.startAnimation(fadeIn);
            btnWasEasy.startAnimation(fadeIn);
        }
    }
}
