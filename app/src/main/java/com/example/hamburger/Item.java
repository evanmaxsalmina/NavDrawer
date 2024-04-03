package com.example.hamburger;

public class Item {

    private String nama;
    private String rating;
    private int gambar, favorit;

    public Item(String nama, String rating, int gambar, int favorit) {

        this.nama = nama;
        this.gambar = gambar;
        this.rating = rating;
        this.favorit = favorit;
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

    public int getFavorit() {
        return favorit;
    }

    public void setFavorit(int favorit) {
        this.favorit = favorit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

