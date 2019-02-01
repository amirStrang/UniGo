package com.eaglet.unigo.Store;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.eaglet.unigo.R;

import java.util.ArrayList;
import java.util.List;

class RecyclerViewHolder extends RecyclerView.ViewHolder
{
    public CheckBox checkBox;
    public TextView question;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        checkBox=(CheckBox)itemView.findViewById(R.id.check);
        question=(TextView)itemView.findViewById(R.id.question);

    }
}

public class StoreRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Questions_Store> listQues=new ArrayList<Questions_Store>();

    public StoreRecyclerAdapter(List<Questions_Store> list)
    {
        this.listQues=list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        final View itemview=inflater.inflate(R.layout.store_itm,parent,false);


        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.checkBox.setChecked(listQues.get(position).getCheck());
        holder.question.setText(listQues.get(position).getQuestion());

    }

    @Override
    public int getItemCount() {
        return listQues.size();
    }

    public void Dismiss(int pos)
    {
        listQues.remove(pos);
        this.notifyItemRemoved(pos);
    }

}

