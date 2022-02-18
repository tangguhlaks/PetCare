package com.example.petcare.user.model;

public class ModelProduk {
    int gambar;
    String bintang;
    String nama;
    String harga;
    String deskripsi;

    public ModelProduk(int gambar, String bintang, String nama, String harga, String deskripsi) {
        this.gambar = gambar;
        this.bintang = bintang;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getBintang() {
        return bintang;
    }

    public void setBintang(String bintang) {
        this.bintang = bintang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
