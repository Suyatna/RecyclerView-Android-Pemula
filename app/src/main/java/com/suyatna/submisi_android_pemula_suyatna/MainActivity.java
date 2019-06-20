package com.suyatna.submisi_android_pemula_suyatna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_activity_main;
    ArrayList<ScoutRegiment> scoutRegimentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_activity_main = findViewById(R.id.rv_activity_main);

        scoutRegimentArrayList = new ArrayList<>();
        getSupportActionBar().setTitle("Mode CardView");
        scoutRegimentArrayList.addAll(ScoutRegimentData.getScoutRegimentListData());
        modeCardView();
    }

    void modeCardView() {
        rv_activity_main.setLayoutManager(new LinearLayoutManager(this));
        ModeCardViewAdapter modeCardViewAdapter = new ModeCardViewAdapter(this);
        modeCardViewAdapter.setModeCardViewAdapter(scoutRegimentArrayList);
        rv_activity_main.setAdapter(modeCardViewAdapter);
    }

    void modeListView() {
        rv_activity_main.setLayoutManager(new LinearLayoutManager(this));
        ModeListAdapter modeListAdapter = new ModeListAdapter(this);
        modeListAdapter.setModeListAdapter(scoutRegimentArrayList);
        rv_activity_main.setAdapter(modeListAdapter);
    }

    void modeGridView() {
        rv_activity_main.setLayoutManager(new LinearLayoutManager(this));
        ModeGridAdapter modeGridAdapter = new ModeGridAdapter(this);
        modeGridAdapter.setModeGridAdapter(scoutRegimentArrayList);
        rv_activity_main.setAdapter(modeGridAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_list:
                modeListView();
                getSupportActionBar().setTitle("Mode ListView");
                break;
            case R.id.action_gird:
                modeGridView();
                getSupportActionBar().setTitle("Mode GridView");
                break;
            case R.id.action_cardview:
                modeCardView();
                getSupportActionBar().setTitle("Mode CardView");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
