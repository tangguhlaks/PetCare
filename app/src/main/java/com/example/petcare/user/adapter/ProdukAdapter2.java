package com.example.petcare.user.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petcare.R;
import com.example.petcare.user.model.ModelProduk;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProdukAdapter2 extends RecyclerView.Adapter<ProdukAdapter2.MyViewHolder> {
    Context context;
    ArrayList<ModelProduk> mlist;

    public ProdukAdapter2(Context context, ArrayList<ModelProduk> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_produk2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bintang.setText(mlist.get(position).getBintang());
        holder.harga.setText(mlist.get(position).getHarga());
        holder.nama.setText(mlist.get(position).getNama());
        Picasso.get().load(mlist.get(position).getGambar()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView bintang,harga,nama;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageproduk);
            bintang = itemView.findViewById(R.id.bintang);
            nama = itemView.findViewById(R.id.namaproduk);
            harga = itemView.findViewById(R.id.harga);
        }
    }
}
