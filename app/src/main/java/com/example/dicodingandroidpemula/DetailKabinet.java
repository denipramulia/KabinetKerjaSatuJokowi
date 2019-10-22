package com.example.dicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailKabinet extends AppCompatActivity {
    public static final String FOTO_KABINET = "foto_kabinet";
    public static final String NAMA_KABINET = "nama_kabinet";
    public static final String DETAIL_KABINET = "detail_kabinet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kabinet);

        int foto = getIntent().getIntExtra(FOTO_KABINET, 0);
        String nama = getIntent().getStringExtra(NAMA_KABINET);
        String detail = getIntent().getStringExtra(DETAIL_KABINET);

        setTitle(nama);

        CircleImageView fotoKabinet = findViewById(R.id.kabinet_foto);
        TextView namaKabinet = findViewById(R.id.kabinet_name);
        TextView detailKabinet = findViewById(R.id.kabinet_detail);

        Glide.with(this).load(foto).into(fotoKabinet);
        namaKabinet.setText(nama);
        detailKabinet.setText(detail);
    }
}
