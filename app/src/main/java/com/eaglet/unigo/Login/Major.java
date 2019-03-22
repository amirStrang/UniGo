package com.eaglet.unigo.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.eaglet.unigo.MainActivity;
import com.eaglet.unigo.R;

public class Major extends AppCompatActivity {
    TextView EnterMajor;
    Button Ensani ,
            Riazi ,
            Tajrobi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        TextView TV_TopMenu = (TextView)findViewById(R.id.TV_TopMenu);
        EnterMajor = (TextView)findViewById(R.id.EnterMajor);
        Ensani = (Button)findViewById(R.id.Ensani);
        Riazi = (Button)findViewById(R.id.Riazi);
        Tajrobi = (Button)findViewById(R.id.Tajrobi);

        Ensani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Major.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Riazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Major.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Tajrobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Major.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
