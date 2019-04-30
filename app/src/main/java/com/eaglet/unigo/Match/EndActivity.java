package com.eaglet.unigo.Match;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class EndActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView btnExit;
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

        btnExit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_exit:
                Intent intent = new Intent(EndActivity.this, SelectMode.class);
                startActivity(intent);
                finish();
                break;

        }

    }
}
