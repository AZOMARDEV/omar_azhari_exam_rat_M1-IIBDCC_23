package com.example.azhariomar;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<ItemModel> items;

    public CustomAdapter(Context context, List<ItemModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.items,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        // Initialize main data
        final ItemModel data=items.get(position);

        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.jobView.setText(items.get(position).getJob());


        holder.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Initialize main data
                ItemModel d=items.get(holder.getPosition());

                // Get id
                final String sID=d.getId();

                // Get text
                String name=d.getName();
                String email=d.getEmail();
                String job=d.getJob();

                // create dialog
                final Dialog dialog=new Dialog(context);


                //show dialog
                dialog.show();

                Button btUpdate=dialog.findViewById(R.id.btn_call);


                btUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Dismiss Dialog
                        dialog.dismiss();

                        notifyDataSetChanged();

                    }
                });

            }
        });
    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}

