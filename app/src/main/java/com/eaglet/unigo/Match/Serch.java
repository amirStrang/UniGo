package com.eaglet.unigo.Match;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.eaglet.unigo.R;

import java.util.ArrayList;
import java.util.List;

public class Serch extends AppCompatActivity{
    private Button btnSerch;
    private RecyclerView recyclerView;
    private List<SerchModel> serchModels = new ArrayList<>();
    private SerchAdapter serchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serch);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.serch_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnSerch = (Button) findViewById(R.id.btn_serch);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_serch);

        btnSerch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serchModels.clear();
                serchAdapter = new SerchAdapter(serchModels);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(serchAdapter);

                for(int i=0;i<10;i++){
                    SerchModel serchModel = new SerchModel("نام کاربری");
                    serchModels.add(serchModel);
                }

                serchAdapter.notifyDataSetChanged();
            }
        });


    }


}
