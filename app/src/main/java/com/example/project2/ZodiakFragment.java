package com.example.project2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ZodiakFragment extends Fragment{

    private RecyclerView rvZodiak;
    private ArrayList<Zodiak> zodiaks = new ArrayList<>();
    private ZodiakDataSource database;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zodiak, container, false);
        rvZodiak = view.findViewById(R.id.rv_zodiak);
        rvZodiak.setHasFixedSize(true);

        zodiaks.addAll(ZodiakDataSource.getListData());
        showRecycleList();
        return view;
    }

    private void showRecycleList() {
        rvZodiak.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListZodiakAdapter adapter = new ListZodiakAdapter(zodiaks);
        rvZodiak.setAdapter(adapter);

        adapter.setOnItemClickCallback(new ListZodiakAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Zodiak data) {
                Intent intent = new Intent(getActivity(), detailZodiak.class);
                intent.putExtra("ZODIAK_DETAIL", data);
                startActivity(intent);
            }
        });
    }
}