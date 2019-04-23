package com.eaglet.unigo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.eaglet.unigo.Match.SelectMode;
import com.eaglet.unigo.Store.Store;


public class HomeFragment extends Fragment {

Button film_btn,Store_btn, matchbtn;
    View view;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view=inflater.inflate(R.layout.fragment_home, container, false);

         init();
         Store_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
               Intent i=new Intent(getActivity().getApplication(),Store.class);
                 startActivity(i);
             }
         });

        matchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), SelectMode.class);
                startActivity(intent);
            }
        });



        return view;


    }

    private void init()
    {
        film_btn=(Button)view.findViewById(R.id.film_btn);
        Store_btn=(Button)view.findViewById(R.id.store_btn);
        matchbtn=view.findViewById(R.id.matchbtn);
    }
}
