package com.example.hamburger;

public class Item {

    private String nama;
    private String rating;
    private int gambar;

    public Item(String nama, String rating, int gambar) {

        this.nama = nama;
        this.gambar = gambar;
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

