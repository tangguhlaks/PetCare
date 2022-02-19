package com.example.petcare.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.petcare.R;
import com.example.petcare.user.adapter.ProdukAdapter;
import com.example.petcare.user.adapter.ProdukAdapter2;
import com.example.petcare.user.model.ModelProduk;

import java.util.ArrayList;

public class KategoriActivity extends AppCompatActivity {
    RecyclerView rcmakanan;
    ProdukAdapter produkAdapter;
    ProdukAdapter2 produkAdapter2;
    ArrayList<ModelProduk> mlist=new ArrayList<>();
    String kategori;
    ImageButton goback;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        title = findViewById(R.id.titlekategori);
        Intent getdata = getIntent();
        title.setText(getdata.getStringExtra("title"));
        kategori = getdata.getStringExtra("title");


        switch (kategori.toLowerCase()){
            case "perawatan":
                rcmakanan = findViewById(R.id.rcviewmakanan);
                rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));
                ModelProduk p1 = new ModelProduk(R.drawable.pp1,"4,5","Pet Bathing","Rp 24.000","-");
                ModelProduk p2 = new ModelProduk(R.drawable.pp2,"4,3","Ear Cleaning","Rp 38.000","-");
                ModelProduk p3 = new ModelProduk(R.drawable.pp3,"3,5","Nail Clipping","Rp 54.000","-");
                ModelProduk p4 = new ModelProduk(R.drawable.pp4,"4,9","Pet Shaving","Rp 84.000","-");
                mlist.add(p1);
                mlist.add(p2);
                mlist.add(p3);
                mlist.add(p4);
                produkAdapter2 = new ProdukAdapter2(getApplicationContext(),mlist);
                rcmakanan.setAdapter(produkAdapter2);
                detailclick();
                break;
            default:
                rcmakanan = findViewById(R.id.rcviewmakanan);
                rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                ModelProduk pp1 = new ModelProduk(R.drawable.whiskasdry,"4,5","Whiskas Dry Adult 480 gr","Rp 24.000","-");
                ModelProduk pp2 = new ModelProduk(R.drawable.whiskaspouch,"4,3","Whiskas Pouch 480 gr","Rp 38.000","-");
                ModelProduk pp3 = new ModelProduk(R.drawable.shampooanjing,"3,5","Shampoo Anjing 250 ml","Rp 54.000","-");
                ModelProduk pp4 = new ModelProduk(R.drawable.dogco,"4,9","Dog Choize Adult 20 Kg","Rp 84.000","-");
                mlist.add(pp1);
                mlist.add(pp2);
                mlist.add(pp3);
                mlist.add(pp4);
                produkAdapter = new ProdukAdapter(getApplicationContext(),mlist);
                rcmakanan.setAdapter(produkAdapter);
                detailclick();
                break;

        }


        goback = findViewById(R.id.backhome);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),UserActivity.class));
                finish();
            }
        });
    }

    private void detailclick() {
        produkAdapter.setOnCallBack(new ProdukAdapter.OnCallBack() {
            @Override
            public void onClickView(ModelProduk modelProduk) {
                Intent i = new Intent(getApplicationContext(),DetailActivity.class);
                i.putExtra("gambar",modelProduk.getGambar());
                i.putExtra("nama",modelProduk.getNama());
                i.putExtra("bintang",modelProduk.getBintang());
                i.putExtra("deskripsi",modelProduk.getDeskripsi());
                i.putExtra("harga",modelProduk.getHarga());
                i.putExtra("kategori",kategori);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),UserActivity.class));
        finish();
    }
}