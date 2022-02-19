package com.example.petcare.user.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petcare.R;
import com.example.petcare.user.model.KategoriModel;
import com.example.petcare.user.model.ModelProduk;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.MyViewHolder> {
    Context context;
    ArrayList<KategoriModel> mlist;
    OnCallBack onCallBack;
    public KategoriAdapter(Context context, ArrayList<KategoriModel> mlist) {
        this.context = context;
        this.mlist = mlist;
    }
    public void setOnCallBack(OnCallBack onCallBack) {
        this.onCallBack = onCallBack;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_kategori,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(mlist.get(position).getTitle());
        Picasso.get().load(mlist.get(position).getIcon()).into(holder.icon);
        holder.cvkategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCallBack.onClickView(mlist.get(position));
            }
        });
    }
    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        CardView cvkategori;
        ImageView icon;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.titlekat);
            icon = itemView.findViewById(R.id.iconkat);
            cvkategori = itemView.findViewById(R.id.cvkategori);
        }
    }
    public interface OnCallBack{
        void onClickView(KategoriModel kategoriModel);
    }
}
