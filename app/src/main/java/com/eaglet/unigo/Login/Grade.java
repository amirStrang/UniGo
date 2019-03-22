package com.eaglet.unigo.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.eaglet.unigo.R;

public class Grade extends AppCompatActivity {

    Button Davazdahom ,
           Yazdahom ,
           Dahom ,
           Nohom ,
           Hashtom ,
           Haftom ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        TextView TV_TopMenu = (TextView)findViewById(R.id.TV_TopMenu);
        Davazdahom = (Button)findViewById(R.id.Davazdahom);
        Yazdahom = (Button)findViewById(R.id.Yazdahom);
        Dahom = (Button)findViewById(R.id.Dahom);
        Nohom = (Button)findViewById(R.id.Nohom);
        Hashtom = (Button)findViewById(R.id.Hashtom);
        Haftom = (Button)findViewById(R.id.Haftom);


        Haftom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });

        Hashtom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });


        Nohom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });

        Dahom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });

        Yazdahom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });

        Davazdahom . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade.this , Major.class);
                startActivity(intent);
            }
        });
    }
}
