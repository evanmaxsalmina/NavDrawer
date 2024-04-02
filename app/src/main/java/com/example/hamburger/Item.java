package com.example.hamburger;

public class Item {

    private String nama;

    private int gambar;

    public Item(int gambar, String nama) {
        this.gambar = gambar;
        this.nama = nama;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

