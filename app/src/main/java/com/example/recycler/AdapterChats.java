package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterChats extends RecyclerView.Adapter<AdapterChats.ViewHolder>{

    ArrayList<DataModelChats> arrayChats;
    Context context;

    public AdapterChats(ArrayList<DataModelChats> arrayChats, Context context) {
        this.arrayChats = arrayChats;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_chats,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.chatImage.setImageResource(arrayChats.get(position).image);
        holder.chatName.setText(arrayChats.get(position).name);
        holder.chatMessage.setText(arrayChats.get(position).message);
        holder.chatTime.setText(arrayChats.get(position).time);
    }

    @Override
    public int getItemCount() {
        return arrayChats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView chatImage;
        TextView chatName,chatMessage,chatTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chatImage=itemView.findViewById(R.id.userItemImage);
            chatName = itemView.findViewById(R.id.userItemName);
            chatMessage = itemView.findViewById(R.id.userItemMessage);
            chatTime = itemView.findViewById(R.id.userItemTime);
        }
    }
}
