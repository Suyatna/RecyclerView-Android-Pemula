package com.suyatna.submisi_android_pemula_suyatna;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ModeGridAdapter extends RecyclerView.Adapter<ModeGridAdapter.GridViewHolder> {

    Context context;
    ArrayList<ScoutRegiment> scoutRegimentArrayList;

    ArrayList<ScoutRegiment> getScoutRegimentArrayList() {
        return scoutRegimentArrayList;
    }

    public ModeGridAdapter(Context context) {
        this.context = context;
    }

    public void setModeGridAdapter(ArrayList<ScoutRegiment> scoutRegimentArrayList) {
        this.scoutRegimentArrayList = scoutRegimentArrayList;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item_grid, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i) {
        final ScoutRegiment scoutRegiment = getScoutRegimentArrayList().get(i);

        Glide.with(context)
                .load(scoutRegiment.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(gridViewHolder.ivPhoto);

        gridViewHolder.ivPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailItem.class);
                intent.putExtra("Regiment", scoutRegiment);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getScoutRegimentArrayList().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.iv_grid_photo);
        }
    }
}
