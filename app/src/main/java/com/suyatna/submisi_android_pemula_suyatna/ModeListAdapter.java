package com.suyatna.submisi_android_pemula_suyatna;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ModeListAdapter extends RecyclerView.Adapter<ModeListAdapter.ListHolder> {

    Context context;
    ArrayList<ScoutRegiment> scoutRegimentArrayList;

    ArrayList<ScoutRegiment> getScoutRegimentArrayList() {
        return scoutRegimentArrayList;
    }

    public ModeListAdapter(Context context) {
        this.context = context;
    }

    public void setModeListAdapter(ArrayList<ScoutRegiment> scoutRegimentArrayList) {
        this.scoutRegimentArrayList = scoutRegimentArrayList;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item_list, viewGroup, false);
        return new ListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder listHolder, int i) {
        final ScoutRegiment scoutRegiment = getScoutRegimentArrayList().get(i);

        Glide.with(context)
                .load(scoutRegiment.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(listHolder.ivPhoto);

        listHolder.tvName.setText(scoutRegiment.getName());
        listHolder.tvAlias.setText(scoutRegiment.getAlias());

        listHolder.ivPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailItem.class);
                intent.putExtra("Regiment", scoutRegiment);
                context.startActivity(intent);
            }
        });

        listHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
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

    public class ListHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvAlias;
        LinearLayout linearLayout;

        public ListHolder(@NonNull View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.ci_list_photo);
            tvName = itemView.findViewById(R.id.tv_list_name);
            tvAlias = itemView.findViewById(R.id.tv_list_alias);
            linearLayout = itemView.findViewById(R.id.line_list);
        }
    }
}
