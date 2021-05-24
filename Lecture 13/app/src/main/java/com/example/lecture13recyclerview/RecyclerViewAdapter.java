package com.example.lecture13recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {
    List<User> list;
    Activity mActivity;
    public RecyclerViewAdapter(List<User> list,Activity mActivity){
        this.list=list;
        this.mActivity=mActivity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.data=list.get(position);
        holder.textViewUserName.setText(holder.data.getName());
        holder.textViewAgeUser.setText(String.valueOf(holder.data.getAge()));
        //holder.imageViewFriend.setImageResource(R.drawable.airplane);
        holder.textViewCity.setText(holder.data.getCity());
    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewUser;
        TextView textViewUserName;
        TextView textViewAgeUser;
        TextView textViewCity;
        User data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewUser=itemView.findViewById(R.id.imageViewUserPicture);
            textViewUserName=itemView.findViewById(R.id.textViewUserName);;
            textViewAgeUser=itemView.findViewById(R.id.textViewUserAge);
            textViewCity=itemView.findViewById(R.id.textViewCity);
        }
    }
}
