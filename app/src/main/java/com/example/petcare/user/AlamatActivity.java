package com.example.petcare.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petcare.R;
import com.google.android.material.button.MaterialButton;

public class AlamatActivity extends AppCompatActivity {
    MaterialButton simpan;
    Intent getdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat);
        getdata = getIntent();
        ImageButton backdet = findViewById(R.id.backdet);
        backdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getdata.getStringExtra("kategori").toLowerCase().equals("perawatan")) {
                    Intent i = new Intent(getApplicationContext(), Detail2Activity.class);
                    i.putExtra("gambar",getdata.getIntExtra("gambar",0));
                    i.putExtra("nama", getdata.getStringExtra("nama"));
                    i.putExtra("bintang", getdata.getStringExtra("bintang"));
                    i.putExtra("deskripsi", getdata.getStringExtra("deskripsi"));
                    i.putExtra("harga", getdata.getStringExtra("harga"));
                    i.putExtra("kategori", getdata.getStringExtra("kategori"));
                    startActivity(i);
                    finish();
                }else {
                    Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                    i.putExtra("gambar",getdata.getIntExtra("gambar",0));
                    i.putExtra("nama", getdata.getStringExtra("nama"));
                    i.putExtra("bintang", getdata.getStringExtra("bintang"));
                    i.putExtra("deskripsi", getdata.getStringExtra("deskripsi"));
                    i.putExtra("harga", getdata.getStringExtra("harga"));
                    i.putExtra("kategori", getdata.getStringExtra("kategori"));
                    startActivity(i);
                    finish();
                }
            }
        });

        simpan = findViewById(R.id.simpanalamat);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getdata.getStringExtra("kategori").toLowerCase().equals("perawatan")) {
                    Intent i = new Intent(getApplicationContext(), Proses2Activity.class);
                    startActivity(i);
                    finish();
                }else {
                    Intent i = new Intent(getApplicationContext(), ProsesActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (getdata.getStringExtra("kategori").toLowerCase().equals("perawatan")) {
            Intent i = new Intent(getApplicationContext(), Detail2Activity.class);
            i.putExtra("gambar",getdata.getIntExtra("gambar",0));
            i.putExtra("nama", getdata.getStringExtra("nama"));
            i.putExtra("bintang", getdata.getStringExtra("bintang"));
            i.putExtra("deskripsi", getdata.getStringExtra("deskripsi"));
            i.putExtra("harga", getdata.getStringExtra("harga"));
            i.putExtra("kategori", getdata.getStringExtra("kategori"));
            startActivity(i);
            finish();
        }else {
            Intent i = new Intent(getApplicationContext(), DetailActivity.class);
            i.putExtra("gambar",getdata.getIntExtra("gambar",0));
            i.putExtra("nama", getdata.getStringExtra("nama"));
            i.putExtra("bintang", getdata.getStringExtra("bintang"));
            i.putExtra("deskripsi", getdata.getStringExtra("deskripsi"));
            i.putExtra("harga", getdata.getStringExtra("harga"));
            i.putExtra("kategori", getdata.getStringExtra("kategori"));
            startActivity(i);
            finish();
        }
    }
}