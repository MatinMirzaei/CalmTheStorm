package com.example.calmthestorm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KitAdapter extends RecyclerView.Adapter<KitAdapter.KitRow>{
    private List<KitItem> kitItemList;

    @NonNull
    @Override
    public KitRow onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.item_kit,parent,false);

        KitRow viewHolder = new KitRow(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KitRow holder, int position) {
        KitItem currentItem = kitItemList.get(position);
        CheckBox cb = holder.kitItemCB;
        cb.setText(currentItem.getKitItemDetail());
    }

    @Override
    public int getItemCount() {
        return kitItemList.size();
    }

    public KitAdapter(List<KitItem> kitItems){
        kitItemList = kitItems;
    }

    public class KitRow extends RecyclerView.ViewHolder {
        public CheckBox kitItemCB;

        public KitRow(@NonNull View itemView) {
            super(itemView);
            kitItemCB = (CheckBox) itemView.findViewById(R.id.kitItemCheckbox);
        }
    }
}
