package com.suyatna.submisi_android_pemula_suyatna;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ModeCardViewAdapter extends RecyclerView.Adapter<ModeCardViewAdapter.CardViewHolder> {

    Context context;
    ArrayList<ScoutRegiment> scoutRegimentArrayList;

    ArrayList<ScoutRegiment> getScoutRegimentArrayList() {
        return scoutRegimentArrayList;
    }

    public ModeCardViewAdapter(Context context) {
        this.context = context;
    }

    public void setModeCardViewAdapter(ArrayList<ScoutRegiment> scoutRegimentArrayList) {
        this.scoutRegimentArrayList = scoutRegimentArrayList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item_cardview, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {
        final ScoutRegiment scoutRegiment = getScoutRegimentArrayList().get(i);

        Glide.with(context)
                .load(scoutRegiment.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewHolder.ivPhoto);

        cardViewHolder.tvName.setText(scoutRegiment.getName());
        cardViewHolder.tvAlias.setText(scoutRegiment.getAlias());

        cardViewHolder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Favorite " +scoutRegiment.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        cardViewHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Share " +scoutRegiment.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        cardViewHolder.ivPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailItem.class);
                intent.putExtra("Regiment", scoutRegiment);
                context.startActivity(intent);
            }
        });

        cardViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
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

    public class CardViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView ivPhoto;
        TextView tvName, tvAlias;
        Button btnFavorite, btnShare;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view);
            ivPhoto = itemView.findViewById(R.id.iv_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAlias = itemView.findViewById(R.id.tv_item_alias);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
