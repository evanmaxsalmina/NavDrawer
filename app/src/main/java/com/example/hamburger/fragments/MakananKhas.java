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

public class MakananKhas extends Fragment implements ItemAdapter.ItemClickListener{

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> dataList;

    public MakananKhas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.rvList);
        dataList = new ArrayList<>();

        dataList.add(new Item(R.drawable.lentog, "Lentog Tanjung"));
        dataList.add(new Item(R.drawable.opor, "Opor Sungginan"));
        dataList.add(new Item(R.drawable.pindang, "Pindang Kerbau"));
        dataList.add(new Item(R.drawable.gongso, "Ayam Gongso"));
        dataList.add(new Item(R.drawable.jangkrik, "Nasi Jangkrik"));
        dataList.add(new Item(R.drawable.lepet, "Lepet"));


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