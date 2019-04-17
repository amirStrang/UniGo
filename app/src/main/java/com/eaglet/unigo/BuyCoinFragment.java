package com.eaglet.unigo;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class BuyCoinFragment extends Fragment {

    RelativeLayout coin_btn1,coin_btn2,coin_btn3,coin_btn4,coin_btn5,coin_btn6;
    ImageView back;
    View view;
    TextView accept,deny;
    public BuyCoinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_buy_coin, container, false);
        init();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
            }
        });
        coin_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        coin_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        coin_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        coin_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        coin_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        coin_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BuyCoinFragment.this, ":)", Toast.LENGTH_SHORT).show();
                show_alert();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


    private void init()
    {
        coin_btn1=(RelativeLayout)view.findViewById(R.id.coin_btn1);
        coin_btn2=(RelativeLayout)view.findViewById(R.id.coin_btn2);
        coin_btn3=(RelativeLayout)view.findViewById(R.id.coin_btn3);
        coin_btn4=(RelativeLayout)view.findViewById(R.id.coin_btn4);
        coin_btn5=(RelativeLayout)view.findViewById(R.id.coin_btn5);
        coin_btn6=(RelativeLayout)view.findViewById(R.id.coin_btn6);

        back=(ImageView)view.findViewById(R.id.back);
    }
    private void show_alert(){

        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = Resources.getSystem().getDisplayMetrics().heightPixels;
        final int myW = (width * 8) / 9;
        final int myH = (height) / 3;
        final int btnW = (myW ) / 2;

        AlertDialog.Builder gbuilder = new AlertDialog.Builder(getContext());
        View gView = getLayoutInflater().inflate(R.layout.get_and_cost, null);

        accept=gView.findViewById(R.id.accept);
        deny=gView.findViewById(R.id.deny);



        gView.setMinimumWidth(myW);
        gView.setMinimumHeight(myH);
        gbuilder.setView(gView);
        final Dialog alertDialog = gbuilder.create();
        alertDialog.show();
        alertDialog.getWindow().setLayout(myW, myH);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Buy_Coins.this, "accepted !", Toast.LENGTH_SHORT).show();
            }
        });
        deny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.cancel();
                // Toast.makeText(Buy_Coins.this, "denied !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
