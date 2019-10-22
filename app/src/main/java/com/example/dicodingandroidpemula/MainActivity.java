package com.example.dicodingandroidpemula;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Kabinet Kerja Jilid 1 2014-2019";
    private RecyclerView rvKabinet;
    private ArrayList<Kabinet> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvKabinet = findViewById(R.id.rv_kabinet);
        rvKabinet.setHasFixedSize(true);

        list.addAll(KabinetData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKabinet.setLayoutManager(new LinearLayoutManager(this));
        ListKabinetAdapter listKabinetAdapter = new ListKabinetAdapter(list);
        rvKabinet.setAdapter(listKabinetAdapter);

        listKabinetAdapter.setOnItemClickCallback(new ListKabinetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kabinet data) {
                showSelectedKabinet(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.about) {
            title = "About";
            showAbout();
        }
    }

    private void showAbout() {
        Intent aboutActivity = new Intent(MainActivity.this, About.class);
        startActivity(aboutActivity);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedKabinet(Kabinet kabinet) {
        Intent detailKabinet = new Intent(MainActivity.this, DetailKabinet.class);
        detailKabinet.putExtra(DetailKabinet.FOTO_KABINET, kabinet.getFoto());
        detailKabinet.putExtra(DetailKabinet.NAMA_KABINET, kabinet.getName());
        detailKabinet.putExtra(DetailKabinet.DETAIL_KABINET, kabinet.getDetail());
        startActivity(detailKabinet);
    }
}

