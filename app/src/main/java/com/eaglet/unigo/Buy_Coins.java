package com.eaglet.unigo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Buy_Coins extends AppCompatActivity {
RelativeLayout coin_btn1,coin_btn2,coin_btn3,coin_btn4,coin_btn5,coin_btn6;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy__coins);

        init();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void init()
    {
        coin_btn1=(RelativeLayout)findViewById(R.id.coin_btn1);
        coin_btn2=(RelativeLayout)findViewById(R.id.coin_btn2);
        coin_btn3=(RelativeLayout)findViewById(R.id.coin_btn3);
        coin_btn4=(RelativeLayout)findViewById(R.id.coin_btn4);
        coin_btn5=(RelativeLayout)findViewById(R.id.coin_btn5);
        coin_btn6=(RelativeLayout)findViewById(R.id.coin_btn6);

        back=(ImageView)findViewById(R.id.back);
    }
}
