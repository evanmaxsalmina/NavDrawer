package com.example.hamburger.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hamburger.ItemAdapter;
import com.example.hamburger.Item;
import com.example.hamburger.R;

import java.util.ArrayList;
import java.util.List;

public class MakananFavorite extends Fragment implements ItemAdapter.ItemClickListener{

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> dataList;

    public MakananFavorite() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_favorite, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new Item("Lentog Tanjung", "5.0", R.drawable.lentog, R.drawable.fav));
        dataList.add(new Item("Kopi Jetak", "4.5", R.drawable.kopijetak, R.drawable.fav));
        dataList.add(new Item("Ayam Gongso", "4.5", R.drawable.gongso, R.drawable.fav));
        dataList.add(new Item("Wedang Blung", "4.5", R.drawable.blung, R.drawable.fav));
        dataList.add(new Item("Pindang Kerbau", "4.5", R.drawable.pindang, R.drawable.fav));
        dataList.add(new Item("Jus Parijoto", "5.0", R.drawable.parijoto, R.drawable.fav));


        adapter = new ItemAdapter(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}