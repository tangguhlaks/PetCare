package com.example.petcare.user.fragment;

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
        KategoriModel m1 = new KategoriModel(R.drawable.makanan,"Makanan");
        KategoriModel m2 = new KategoriModel(R.drawable.aksesoris,"Aksesoris");
        KategoriModel m3 = new KategoriModel(R.drawable.mandi,"Alat Mandi");
        KategoriModel m4 = new KategoriModel(R.drawable.perawatan,"Perawatan");
        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
        kategoriAdapter = new KategoriAdapter(getContext(),mlist);
        rckat.setAdapter(kategoriAdapter);


        rcreko =  view.findViewById(R.id.rcviewrekomendasi);
        rcreko.setLayoutManager(new GridLayoutManager(getContext(),2));
        ModelProduk p1 = new ModelProduk(R.drawable.whiskasdry,"4,5","Whiskas Dry Adult 480 gr","Rp 24.000","-");
        ModelProduk p2 = new ModelProduk(R.drawable.whiskaspouch,"4,3","Whiskas Pouch 480 gr","Rp 38.000","-");
        ModelProduk p3 = new ModelProduk(R.drawable.shampooanjing,"3,5","Shampoo Anjing 250 ml","Rp 54.000","-");
        ModelProduk p4 = new ModelProduk(R.drawable.dogco,"4,9","Dog Choize Adult 20 Kg","Rp 84.000","-");
        mlistproduk.add(p1);
        mlistproduk.add(p2);
        mlistproduk.add(p3);
        mlistproduk.add(p4);
        produkAdapter = new ProdukAdapter(getContext(),mlistproduk);
        rcreko.setAdapter(produkAdapter);
        return view;
    }
}