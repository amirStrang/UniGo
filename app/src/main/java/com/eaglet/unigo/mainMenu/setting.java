package com.eaglet.unigo.mainMenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import com.eaglet.unigo.R;

public class setting extends AppCompatActivity {
RelativeLayout buy_coin,qfactory ,invite,rating,report,contact,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        buy_coin=findViewById(R.id.buyicon);
        qfactory=findViewById(R.id.qfactory);
        invite=findViewById(R.id.invite);
        rating=findViewById(R.id.rating);
        report=findViewById(R.id.report);
        contact=findViewById(R.id.contact);
        about=findViewById(R.id.about);
    }

}
