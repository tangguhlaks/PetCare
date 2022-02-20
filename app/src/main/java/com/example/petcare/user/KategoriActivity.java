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
                detailclick2();
                break;
            case "makanan":
                rcmakanan = findViewById(R.id.rcviewmakanan);
                rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                ModelProduk pp1 = new ModelProduk(R.drawable.whiskasdry,"4,5","Whiskas Dry Adult 480 gr","Rp 24.000","Makanan kucing WHISKAS® mengandung:\n" +
                        "1. WHISKAS makanan kucing lengkap dan seimbang, dirancang khusus untuk memenuhi kebutuhan kucing Anda pada tahap kehidupan mereka.\n" +
                        "2. Milky Pockets - Renyah di bagian luar dengan tekstur creamy lezat di tengah.\n" +
                        "3.Lengkungan WHISKAS Dry akan membantu merawat kesehatan mulut dan gigi mereka.\n" +
                        "4. Diperkaya dengan kalsium dan fosfor, termasuk vitamin D untuk pertumbuhan tulang dan tubuh yang sehat.\n" +
                        "5. Mengandung antioksidan alami berdasarkan vitamin E untuk sistem kekebalan tubuh yang sehat.\n" +
                        "6. Protein dan lemak berkualitas terpilih untuk menyediakan energi untuk bermain");
                ModelProduk pp2 = new ModelProduk(R.drawable.pedigree,"4,3","Pedigree Adult 3 kg","Rp 38.000","-");
                ModelProduk pp3 = new ModelProduk(R.drawable.whiskaspouch,"3,5","Whiskas Pouch Junior Mackerel","Rp 54.000","-");
                ModelProduk pp4 = new ModelProduk(R.drawable.dogco,"4,9","Dog Choize Adult 20 Kg","Rp 84.000","-");
                mlist.add(pp1);
                mlist.add(pp2);
                mlist.add(pp3);
                mlist.add(pp4);
                produkAdapter = new ProdukAdapter(getApplicationContext(),mlist);
                rcmakanan.setAdapter(produkAdapter);
                detailclick();
                break;
            case "aksesoris":
                rcmakanan = findViewById(R.id.rcviewmakanan);
                rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                ModelProduk aa1 = new ModelProduk(R.drawable.kalungkucingbiru,"4,5","Kalung Kucing Warna Biru","Rp 40.000","1.Bisa digunakan untuk Kitten maupun Adult 2.Material: Silicone, Metal 3.Total Length: app.30cm/11.81in 4.Width: app.1cm/0.39i");
                ModelProduk aa2 = new ModelProduk(R.drawable.kandangkucing,"4,3","Kandang Kucing 60 X 80 cm","Rp 140.000","-");
                ModelProduk aa3 = new ModelProduk(R.drawable.kalungkucingcoklat,"3,5","Kalung Kucing Warna Coklat","Rp 45.000","-");
                ModelProduk aa4 = new ModelProduk(R.drawable.talingpengikatanjingnilon,"4,9","Tali Pengikat Anjing Nilon","Rp 50.000","-");
                mlist.add(aa1);
                mlist.add(aa2);
                mlist.add(aa3);
                mlist.add(aa4);
                produkAdapter = new ProdukAdapter(getApplicationContext(),mlist);
                rcmakanan.setAdapter(produkAdapter);
                detailclick();
                break;
            case "alat mandi":
                rcmakanan = findViewById(R.id.rcviewmakanan);
                rcmakanan.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                ModelProduk ab1 = new ModelProduk(R.drawable.shampooanjing,"4,5","Shampoo Anjing 250 ml","Rp 34.000","1. Diformulasikan untuk mengatasi masalah kulit dan bulu dengan bahan yang efektif\n" +
                        "2.Mampu mengatasi masalah pada kulit yang disebabkan oleh fungus dan mengandung anti bakteri serta anti sheborrhea, uv screen, dan anti iritasi\n" +
                        "3.Ideal digunakan untuk anjing\n");
                ModelProduk ab2 = new ModelProduk(R.drawable.sisiranjing,"4,3","Shampoo Anjing 250 ml","Rp 280.000","-");
                ModelProduk ab3 = new ModelProduk(R.drawable.handukkucing,"3,5","Handuk Kucing 42cm x 66cm","Rp 110.000","-");
                ModelProduk ab4 = new ModelProduk(R.drawable.shampookucing,"4,9","Shampoo Kucing 600 ml","Rp 80.000","-");
                mlist.add(ab1);
                mlist.add(ab2);
                mlist.add(ab3);
                mlist.add(ab4);
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

    private void detailclick2() {
        produkAdapter2.setOnCallBack(new ProdukAdapter2.OnCallBack() {
            @Override
            public void onClickView(ModelProduk modelProduk) {
                Intent i = new Intent(getApplicationContext(),Detail2Activity.class);
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
        Intent i = new Intent(getApplicationContext(), UserActivity.class);
        i.putExtra("go","home");
        startActivity(i);
        finish();
    }
}