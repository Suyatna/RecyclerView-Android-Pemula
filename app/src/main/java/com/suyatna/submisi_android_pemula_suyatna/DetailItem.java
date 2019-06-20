package com.suyatna.submisi_android_pemula_suyatna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailItem extends AppCompatActivity {

    TextView name, row_name, alias, row_alias, row_species, row_gender, row_age, description, row_birthplace;
    ImageView ivPhoto;
    CircleImageView circleImageView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        name = findViewById(R.id.tv_detail_name);
        row_name = findViewById(R.id.tv_detail_row_name);
        alias = findViewById(R.id.tv_detail_alias);
        row_alias = findViewById(R.id.tv_detail_row_alias);
        row_species = findViewById(R.id.tv_detail_row_species);
        row_gender = findViewById(R.id.tv_detail_row_gender);
        row_age = findViewById(R.id.tv_detail_row_age);
        description = findViewById(R.id.tv_detail_deskripsi);
        row_birthplace = findViewById(R.id.tv_detail_row_birthplace);
        circleImageView = findViewById(R.id.ci_item_photo);

        Intent intent = getIntent();
        ScoutRegiment scoutRegiment = intent.getParcelableExtra("Regiment");

        Glide.with(this).load(scoutRegiment.getPhoto()).into(circleImageView);

        name.setText(scoutRegiment.getName());
        row_name.setText(scoutRegiment.getName());
        alias.setText(scoutRegiment.getAlias());
        row_alias.setText(scoutRegiment.getAlias());
        row_species.setText(scoutRegiment.getSpecies());
        row_gender.setText(scoutRegiment.getGender());
        row_age.setText(scoutRegiment.getAge());
        description.setText(scoutRegiment.getDescription());
        row_birthplace.setText(scoutRegiment.getBirthplace());

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(scoutRegiment.getName());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
