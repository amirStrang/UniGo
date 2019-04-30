package com.eaglet.unigo.Match;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eaglet.unigo.R;

import java.util.List;

public class TurnAdapter extends RecyclerView.Adapter<TurnAdapter.MyViewHolder> {
    private List<TurnModel> turnList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtUserName;
        private TextView txtScore;
        public MyViewHolder(View view) {
            super(view);
            txtUserName = (TextView) view.findViewById(R.id.txt_turn_username);
            txtScore = (TextView) view.findViewById(R.id.txt_turn_score);

        }
    }

    public TurnAdapter(List<TurnModel> turnList){
        this.turnList = turnList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_row_turn, viewGroup, false);

        return new TurnAdapter.MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        TurnModel turnModel = turnList.get(i);
        myViewHolder.txtUserName.setText(turnList.get(i).getUserName());
        myViewHolder.txtScore.setText(turnList.get(i).getScore());
    }


    @Override
    public int getItemCount() {
        return turnList.size();
    }


}
