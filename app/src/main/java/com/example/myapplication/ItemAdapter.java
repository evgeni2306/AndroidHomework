package com.example.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    interface OnStateClickListener {
        void onStateClick(ItemClass ListClass, int position);
    }

    private final OnStateClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<ItemClass> Items;

    ItemAdapter(Context context, List<ItemClass> ItemClass, OnStateClickListener onClickListener) {
        this.Items = ItemClass;
        this.inflater = LayoutInflater.from(context);
        this.onClickListener = onClickListener;
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {
        ItemClass ItemClass = Items.get(position);
        holder.nameView.setText(ItemClass.getName());
        holder.surnameView.setText(ItemClass.getSurname());
        holder.cityView.setText(ItemClass.getcity());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onStateClick(ItemClass, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, surnameView, cityView;

        ViewHolder(View view) {
            super(view);
            nameView = view.findViewById(R.id.ItemName);
            surnameView = view.findViewById(R.id.ItemSurname);
            cityView = view.findViewById(R.id.ItemCity);

        }
    }
}