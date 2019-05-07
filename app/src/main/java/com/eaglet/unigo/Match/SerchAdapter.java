package com.eaglet.unigo.Match;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eaglet.unigo.R;

import java.util.List;

public class SerchAdapter extends RecyclerView.Adapter<SerchAdapter.MyViewHolder>  {
    private List<SerchModel> serchList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtUserName;

        public MyViewHolder(View view) {
            super(view);
            txtUserName = (TextView) view.findViewById(R.id.txt_turn_username);

        }
    }

    public SerchAdapter(List<SerchModel> serchList){
        this.serchList = serchList;
    }


    @NonNull
    @Override
    public SerchAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.serch_model_row, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SerchAdapter.MyViewHolder myViewHolder, int i) {
        SerchModel serchModel = serchList.get(i);
        myViewHolder.txtUserName.setText(serchList.get(i).getUserName());
    }

    @Override
    public int getItemCount() {
        return serchList.size();
    }
}
