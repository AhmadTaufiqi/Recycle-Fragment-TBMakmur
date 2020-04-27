package com.kipli.tbmakmur.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kipli.tbmakmur.R;
import com.kipli.tbmakmur.adapter.ListItemAdapter;
import com.kipli.tbmakmur.data.ItemData;
import com.kipli.tbmakmur.model.ItemModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private ArrayList<ItemModel> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_home, container,false);
        RecyclerView recyclerView =view.findViewById(R.id.rv_home);
        recyclerView.setHasFixedSize(true);
        list.addAll(ItemData.getListData());
        ListItemAdapter listAdapter = new ListItemAdapter(list);
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
         return view;
    }
}