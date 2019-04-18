package com.eaglet.unigo;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MoreFragment extends Fragment {
    View mview;
    RelativeLayout buy_coin,qfactory ,invite,rating,report,contact,about;
    ImageView backbtn;
    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         mview=inflater.inflate(R.layout.fragment_more, container, false);
        buy_coin = mview.findViewById(R.id.buyicon);
        qfactory = mview.findViewById(R.id.qfactory);
        invite = mview.findViewById(R.id.invite);
        rating= mview.findViewById(R.id.rating);
        report= mview.findViewById(R.id.report);
        contact= mview.findViewById(R.id.contact);
        about= mview.findViewById(R.id.about);
        backbtn=mview.findViewById(R.id.back);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Invite_Friends.class);
                startActivity(intent);
            }
        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert_report_maker();
            }
        });

        // Inflate the layout for this fragment
        return mview;
    }

    private void alert_report_maker(){
        int width= Resources.getSystem().getDisplayMetrics().widthPixels;
        int height= Resources.getSystem().getDisplayMetrics().heightPixels;
        final int myW=(width * 8) / 9;
        final int myH=(height*3)/7;
        AlertDialog.Builder rbuilder=new AlertDialog.Builder(getContext());
        View rView=getLayoutInflater().inflate(R.layout.report_panel,null);
        EditText reportMessage=rView.findViewById(R.id.reportmsg);
        RelativeLayout send=rView.findViewById(R.id.send);

        rView.setMinimumWidth(myW);
        rView.setMinimumHeight(myH);
        rbuilder.setView(rView);
        final Dialog alertDialog = rbuilder.create();
        alertDialog.show();
        alertDialog.getWindow().setLayout(myW,myH);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "sent !", Toast.LENGTH_SHORT).show();
                alertDialog.cancel();
            }
        });
    }

}
