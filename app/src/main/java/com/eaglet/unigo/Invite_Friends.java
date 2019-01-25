package com.eaglet.unigo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Invite_Friends extends AppCompatActivity {
RelativeLayout share,inf;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite__friends);

        init();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "";
                String shareSub = "";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });

        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i=new Intent(getBaseContext(),);
//                startActivity(i);
            }
        });
    }

    private void init()
    {
        back=(ImageView)findViewById(R.id.back);

        share=(RelativeLayout)findViewById(R.id.btn_share);
        inf=(RelativeLayout)findViewById(R.id.btn_inf);
    }
}
