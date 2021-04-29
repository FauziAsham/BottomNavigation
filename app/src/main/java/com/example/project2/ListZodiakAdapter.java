package com.example.project2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListZodiakAdapter extends RecyclerView.Adapter<ListZodiakAdapter.ListViewHolder> {

    private List<Zodiak> zodiaks;

    public ListZodiakAdapter (List<Zodiak> zodiaks) {
        this.zodiaks = zodiaks;
    }
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_zodiak, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

        Zodiak zodiak = zodiaks.get(position);

        holder.tvName.setText(zodiak.getName());
        holder.tvDetail.setText(zodiak.getDetail());
        holder.ivPhoto.setImageResource(zodiak.getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(zodiaks.get(holder.getBindingAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return zodiaks.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.iv_zodiak);
            tvName = itemView.findViewById(R.id.tv_zodiak_name);
            tvDetail = itemView.findViewById(R.id.tv_zodiak_detail);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Zodiak data);
    }
}
