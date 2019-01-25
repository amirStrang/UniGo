package com.eaglet.unigo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class BuyCoinFragment extends Fragment {

    RelativeLayout coin_btn1,coin_btn2,coin_btn3,coin_btn4,coin_btn5,coin_btn6;
    ImageView back;
    View view;
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
}
