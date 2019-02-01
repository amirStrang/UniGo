package com.eaglet.unigo.Store;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.eaglet.unigo.R;

import java.util.ArrayList;
import java.util.List;

public class Store extends AppCompatActivity {

    ImageView back;
    FloatingActionButton download;


    ///////////////////Recycler
    private RecyclerView Q_list;
    private StoreRecyclerAdapter storeRecyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Questions_Store> questions_stores = new ArrayList<Questions_Store>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        init();
        initData();


        Q_list=(RecyclerView)findViewById(R.id.Q_list);
        layoutManager=new LinearLayoutManager(this);
        Q_list.setLayoutManager(layoutManager);
        storeRecyclerAdapter=new StoreRecyclerAdapter(questions_stores);
        Q_list.setAdapter(storeRecyclerAdapter);

        ItemTouchHelper.Callback callback=new SwipeHelper(storeRecyclerAdapter);
        ItemTouchHelper helper=new ItemTouchHelper(callback);
        helper.attachToRecyclerView(Q_list);
    }




    public void initData()
    {
        questions_stores.add(new Questions_Store(true,"ریاضی......................."));
        questions_stores.add(new Questions_Store(false,"فیزیک......................."));
        questions_stores.add(new Questions_Store(true,"ریاضی......................."));
        questions_stores.add(new Questions_Store(false,"شیمی......................."));
        questions_stores.add(new Questions_Store(true,"ریاضی......................."));
        questions_stores.add(new Questions_Store(false,"فیزیک......................."));
        questions_stores.add(new Questions_Store(true,"ریاضی......................."));
        questions_stores.add(new Questions_Store(false,"شیمی......................."));
    }

    private void init()
    {
        back=(ImageView)findViewById(R.id.back);
        download=(FloatingActionButton)findViewById(R.id.download);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///////download the pdf of question
            }
        });
    }
}
