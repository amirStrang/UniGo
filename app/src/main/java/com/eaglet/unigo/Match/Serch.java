package com.eaglet.unigo.Match;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
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
import java.util.Random;

public class Serch extends AppCompatActivity {
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

        serchAdapter = new SerchAdapter(serchModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(serchAdapter);

        btnSerch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showListItem();
            }

        });

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                showDialog();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                showDialog();
                            }
                        })
        );
    }


    public void showListItem() {
        serchModels.clear();

        for (int i = 0; i < 10; i++) {
            SerchModel serchModel = new SerchModel("نام کاربری");
            serchModels.add(serchModel);
        }

        serchAdapter.notifyDataSetChanged();


    }

    public void showDialog(){
        final MathDialog cdd = new MathDialog(Serch.this);
        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
        cdd.txtMessage.setText("مطمعنی میخوای باهاش مسابقه بدی ؟");
        cdd.txtTitle.setText("UniGo");
        cdd.btnYes.setText("بله");
        cdd.cancel.setText("خیر");

        cdd.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdd.d.dismiss();
            }
        });

        cdd.btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdd.dismiss();
                showDialog2();
            }
        });
    }

    public void showDialog2(){

        final MathDialog_2 cdd2 = new MathDialog_2(Serch.this);
        cdd2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd2.show();
        cdd2.txtMessage.setText("صبر کن ببینم آنلاینه ...");
        cdd2.txtTitle.setText("UniGo");
        cdd2.cancel.setText("بیخیال");

        final Handler handler = new Handler();

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cdd2.dismiss();
                final int random = new Random().nextInt(2);
                if (random == 0)
                    showDialog3();
                else {
                    Intent intent = new Intent(Serch.this, SelectLesson.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        handler.postDelayed(runnable,5000);

        cdd2.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                cdd2.dismiss();
            }
        });
    }

    public void showDialog3(){
        final MathDialog_2 cdd3 = new MathDialog_2(Serch.this);
        cdd3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd3.show();
        cdd3.txtMessage.setText("نام کاربری قبول نکرد باهات مسابقه بده");
        cdd3.txtTitle.setText("حریف قبول نکرد");
        cdd3.cancel.setText("باشه");

        cdd3.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdd3.dismiss();
            }
        });
    }
}


