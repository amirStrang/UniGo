package com.eaglet.unigo.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eaglet.unigo.R;
import com.eaglet.unigo.Registering.Register21;

public class SplashAndLogin extends AppCompatActivity {

    Button loginbtn;
    Button registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_and_login);

        loginbtn=(Button)findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ///it should go to code verifying activity and then go to Register21 but now code verifying activity is unavailable!!!
                Intent intent =new Intent(SplashAndLogin.this , CodeVerify.class);
                startActivity(intent);
            }
        });
        registerbtn=findViewById(R.id.registerbtn);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SplashAndLogin.this , Register21.class);
                startActivity(intent);
            }
        });
    }

}
