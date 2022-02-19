package com.example.petcare.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.petcare.R;

public class Detail2Activity extends AppCompatActivity {
    TextView harga1,harga2,bintang,nama,desc,title;
    ImageView gambar;
    Intent getdata;
    ImageButton backk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        harga1 = findViewById(R.id.dharga);
        harga2 = findViewById(R.id.dharga2);
        bintang = findViewById(R.id.dbintang);
        nama = findViewById(R.id.dnama);
        desc = findViewById(R.id.ddesc);
        gambar = findViewById(R.id.dgambar);
        title = findViewById(R.id.titlekategori);
        backk = findViewById(R.id.backkategori);


        getdata = getIntent();
        title.setText("Info "+getdata.getStringExtra("kategori"));
        harga1.setText(getdata.getStringExtra("harga"));
        harga2.setText(getdata.getStringExtra("harga"));
        nama.setText(getdata.getStringExtra("nama"));
        bintang.setText(getdata.getStringExtra("bintang"));
        desc.setText(getdata.getStringExtra("deskripsi"));
        gambar.setImageResource(getdata.getIntExtra("gambar",0));

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),KategoriActivity.class);
                i.putExtra("title",getdata.getStringExtra("kategori"));
                startActivity(i);
                finish();
            }
        });
        Button beli = findViewById(R.id.beli2);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),AlamatActivity.class);
                i.putExtra("gambar",getdata.getIntExtra("gambar",0));
                i.putExtra("nama",getdata.getStringExtra("nama"));
                i.putExtra("bintang",getdata.getStringExtra("bintang"));
                i.putExtra("deskripsi",getdata.getStringExtra("deskripsi"));
                i.putExtra("harga",getdata.getStringExtra("harga"));
                i.putExtra("kategori",getdata.getStringExtra("kategori"));
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(),KategoriActivity.class);
        i.putExtra("title",getdata.getStringExtra("kategori"));
        startActivity(i);
        finish();
    }
}