package com.example.azhariomar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    Button buttonView;
    TextView nameView, emailView, jobView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        buttonView = itemView.findViewById(R.id.btn_call);
        nameView = itemView.findViewById(R.id.txt_name);
        emailView = itemView.findViewById(R.id.txt_email);
        jobView = itemView.findViewById(R.id.txt_job);
    }
}
