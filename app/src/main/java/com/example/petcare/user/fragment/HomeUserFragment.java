package com.example.petcare.user.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petcare.R;
import com.example.petcare.user.Detail2Activity;
import com.example.petcare.user.DetailActivity;
import com.example.petcare.user.KategoriActivity;
import com.example.petcare.user.adapter.KategoriAdapter;
import com.example.petcare.user.adapter.ProdukAdapter;
import com.example.petcare.user.model.KategoriModel;
import com.example.petcare.user.model.ModelProduk;

import java.util.ArrayList;

public class HomeUserFragment extends Fragment {
    RecyclerView rckat;
    KategoriAdapter kategoriAdapter;
    ProdukAdapter produkAdapter;
    RecyclerView rcreko;

    ArrayList<KategoriModel> mlist = new ArrayList<>();
    ArrayList<ModelProduk> mlistproduk = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_user_fragment, container, false);

        rckat = view.findViewById(R.id.rcviewkat);
        rckat.setLayoutManager(new GridLayoutManager(getContext(),2));
        KategoriModel m1 = new KategoriModel(R.drawable.makanan,"Makanan", KategoriActivity.class);
        KategoriModel m2 = new KategoriModel(R.drawable.aksesoris,"Aksesoris", KategoriActivity.class);
        KategoriModel m3 = new KategoriModel(R.drawable.mandi,"Alat Mandi", KategoriActivity.class);
        KategoriModel m4 = new KategoriModel(R.drawable.perawatan,"Perawatan", KategoriActivity.class);
        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
        kategoriAdapter = new KategoriAdapter(getContext(),mlist);
        rckat.setAdapter(kategoriAdapter);
        onClickKategori();

        rcreko =  view.findViewById(R.id.rcviewrekomendasi);
        rcreko.setLayoutManager(new GridLayoutManager(getContext(),2));
        ModelProduk pp1 = new ModelProduk(R.drawable.whiskasdry,"4,5","Whiskas Dry Adult 480 gr","Rp 24.000","Makanan kucing WHISKAS® mengandung:\n" +
                "1. WHISKAS makanan kucing lengkap dan seimbang, dirancang khusus untuk memenuhi kebutuhan kucing Anda pada tahap kehidupan mereka.\n" +
                "2. Milky Pockets - Renyah di bagian luar dengan tekstur creamy lezat di tengah.\n" +
                "3.Lengkungan WHISKAS Dry akan membantu merawat kesehatan mulut dan gigi mereka.\n" +
                "4. Diperkaya dengan kalsium dan fosfor, termasuk vitamin D untuk pertumbuhan tulang dan tubuh yang sehat.\n" +
                "5. Mengandung antioksidan alami berdasarkan vitamin E untuk sistem kekebalan tubuh yang sehat.\n" +
                "6. Protein dan lemak berkualitas terpilih untuk menyediakan energi untuk bermain");
        ModelProduk pp2 = new ModelProduk(R.drawable.pedigree,"4,3","Pedigree Adult 3 kg 480 gr","Rp 38.000","-");
        ModelProduk pp3 = new ModelProduk(R.drawable.whiskaspouch,"3,5","Whiskas Pouch Junior Mackerel","Rp 54.000","-");
        ModelProduk pp4 = new ModelProduk(R.drawable.dogco,"4,9","Dog Choize Adult 20 Kg","Rp 84.000","-");
        mlistproduk.add(pp1);
        mlistproduk.add(pp2);
        mlistproduk.add(pp3);
        mlistproduk.add(pp4);
        produkAdapter = new ProdukAdapter(getContext(),mlistproduk);
        rcreko.setAdapter(produkAdapter);
        onClickProduk();
        return view;
    }

    private void onClickProduk() {
        produkAdapter.setOnCallBack(new ProdukAdapter.OnCallBack() {
            @Override
            public void onClickView(ModelProduk modelProduk) {
                Intent i = new Intent(getContext(), DetailActivity.class);
                i.putExtra("gambar",modelProduk.getGambar());
                i.putExtra("nama",modelProduk.getNama());
                i.putExtra("bintang",modelProduk.getBintang());
                i.putExtra("deskripsi",modelProduk.getDeskripsi());
                i.putExtra("harga",modelProduk.getHarga());
                i.putExtra("kategori","home");
                startActivity(i);
            }
        });
    }

    private void onClickKategori() {
        kategoriAdapter.setOnCallBack(new KategoriAdapter.OnCallBack() {
            @Override
            public void onClickView(KategoriModel kategoriModel) {
                Intent i = new Intent(getContext(),kategoriModel.getToclass());
                i.putExtra("title",kategoriModel.getTitle());
                startActivity(i);
            }
        });
    }
}
