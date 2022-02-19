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
import com.example.petcare.user.model.ModelProduk;

import java.util.ArrayList;

public class KategoriActivity extends AppCompatActivity {
    RecyclerView rcmakanan;
    ProdukAdapter produkAdapter;
    ArrayList<ModelProduk> mlist=new ArrayList<>();

    ImageButton goback;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        title = findViewById(R.id.titlekategori);
        Intent getdata = getIntent();
        title.setText(getdata.getStringExtra("title"));

        rcmakanan = findViewById(R.id.rcviewmakanan);
        rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        ModelProduk p1 = new ModelProduk(R.drawable.whiskasdry,"4,5","Whiskas Dry Adult 480 gr","Rp 24.000","-");
        ModelProduk p2 = new ModelProduk(R.drawable.whiskaspouch,"4,3","Whiskas Pouch 480 gr","Rp 38.000","-");
        ModelProduk p3 = new ModelProduk(R.drawable.shampooanjing,"3,5","Shampoo Anjing 250 ml","Rp 54.000","-");
        ModelProduk p4 = new ModelProduk(R.drawable.dogco,"4,9","Dog Choize Adult 20 Kg","Rp 84.000","-");
        mlist.add(p1);
        mlist.add(p2);
        mlist.add(p3);
        mlist.add(p4);
        produkAdapter = new ProdukAdapter(getApplicationContext(),mlist);
        rcmakanan.setAdapter(produkAdapter);

        goback = findViewById(R.id.backhome);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),UserActivity.class));
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