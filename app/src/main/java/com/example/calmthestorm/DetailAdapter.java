package com.example.calmthestorm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ListsRow>{
    private List<InfoItem> infoItemList;


    @NonNull
    @Override
    public ListsRow onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.item_info,parent,false);

        ListsRow viewHolder = new ListsRow(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListsRow holder, int position) {
        InfoItem currentItem = infoItemList.get(position);
        TextView tv = holder.infoTV;
        tv.setText(currentItem.getMyInfo());
    }

    @Override
    public int getItemCount() {
        return infoItemList.size();
    }

    public DetailAdapter(List<InfoItem> infoItems){
        infoItemList = infoItems;
    }

    public static class ListsRow extends RecyclerView.ViewHolder {
        public TextView infoTV;

        public ListsRow(@NonNull View itemView) {
            super(itemView);
            infoTV = (TextView) itemView.findViewById(R.id.infoItemText);
        }
    }
}
