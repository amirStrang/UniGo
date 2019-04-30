package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.eaglet.unigo.R;

import java.util.ArrayList;
import java.util.List;

public class SelectMode extends AppCompatActivity implements View.OnClickListener{

    private TextView btnSerchName;
    private TextView btnRandomOpp;
    private TextView btnRobot;
    private List<TurnModel> yourTurnModels = new ArrayList<>();
    private List<TurnModel> oppTurnModels = new ArrayList<>();

    private TurnAdapter yourTurnAdapter;
    private TurnAdapter oppTurnAdapter;

    private RecyclerView yourTurnRecycler;
    private RecyclerView oppTurnRecycler;


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

        yourTurnRecycler = (RecyclerView) findViewById(R.id.your_turn_recycler);
        oppTurnRecycler = (RecyclerView) findViewById(R.id.opp_turn_recycler);

        btnSerchName = (TextView) findViewById(R.id.txt_serchname_back);
        btnRandomOpp = (TextView) findViewById(R.id.txt_randraghib_back);
        btnRobot = (TextView) findViewById(R.id.txt_robot_bac);

        btnSerchName.setOnClickListener(this);
        btnRandomOpp.setOnClickListener(this);
        btnRobot.setOnClickListener(this);

        init();

    }

    public void init(){
        oppTurnModels.clear();
        yourTurnModels.clear();

        yourTurnAdapter = new TurnAdapter(yourTurnModels);
        oppTurnAdapter = new TurnAdapter(oppTurnModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(getApplicationContext());

        yourTurnRecycler.setLayoutManager(mLayoutManager);
        oppTurnRecycler.setLayoutManager(mLayoutManager2);

        yourTurnRecycler.setItemAnimator(new DefaultItemAnimator());
        oppTurnRecycler.setItemAnimator(new DefaultItemAnimator());

        yourTurnRecycler.setAdapter(yourTurnAdapter);
        oppTurnRecycler.setAdapter(oppTurnAdapter);


        for(int i=0;i<3;i++){
            TurnModel turnModel = new TurnModel("نام کاربری", "1 - 3");
            yourTurnModels.add(turnModel);
        }

        for(int i=0;i<2;i++){
            TurnModel turnModel = new TurnModel("نام کاربری", "2 - 3");
            oppTurnModels.add(turnModel);
        }

        yourTurnAdapter.notifyDataSetChanged();
        oppTurnAdapter.notifyDataSetChanged();


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
