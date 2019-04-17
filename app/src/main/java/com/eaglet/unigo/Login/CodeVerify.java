package com.eaglet.unigo.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.eaglet.unigo.MainActivity;
import com.eaglet.unigo.R;
import com.eaglet.unigo.Registering.Register23;

public class CodeVerify extends AppCompatActivity {

    TextView Tv1_CD , Tv2_CD , Tv3_CD , TV_TopMenu_CD ;
    EditText Ed1_CD ;
    Button Btn1_CD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verify);

        TV_TopMenu_CD=(TextView)findViewById(R.id.TV_TopMenu_CD);
        Tv1_CD=(TextView)findViewById(R.id.Tv1_CD);
        Tv2_CD=(TextView)findViewById(R.id.Tv2_CD);
        Tv3_CD=(TextView)findViewById(R.id.Tv3_CD);
        Ed1_CD=(EditText)findViewById(R.id.Ed1_CD);
        Btn1_CD=(Button)findViewById(R.id.Btn1_CD);
        Btn1_CD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getIntent();
                String rule=i.getStringExtra("rule");
                if(rule=="teacher"){
                    Intent intent=new Intent(CodeVerify.this,Grade.class);
                    startActivity(intent);
                }else if (rule=="student"){
                    Intent intent=new Intent(CodeVerify.this,Register23.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(CodeVerify.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
}
