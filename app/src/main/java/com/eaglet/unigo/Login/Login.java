package com.eaglet.unigo.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.eaglet.unigo.R;

public class Login extends AppCompatActivity {
    TextView EnterPhone;
    EditText ET_EnterPhone;
    Button BtnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       TextView TV_TopMenu = (TextView)findViewById(R.id.TV_TopMenu);
        EnterPhone = (TextView)findViewById(R.id.EnterPhone);
        ET_EnterPhone=(EditText)findViewById(R.id.ET_EnterPhone);
        BtnNext = (Button)findViewById(R.id.BtnNext);
    }
}
