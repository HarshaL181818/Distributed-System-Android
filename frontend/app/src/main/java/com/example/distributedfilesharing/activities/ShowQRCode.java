package com.example.distributedfilesharing.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.distributedfilesharing.R;
import com.example.distributedfilesharing.adapter.FileAdapter;
import com.example.distributedfilesharing.model.FileData;

import java.util.ArrayList;
import java.util.List;


public class ShowQRCode extends Fragment {

    private RecyclerView recyclerView;
    private FileAdapter fileAdapter;
    private List<FileData> fileList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_q_r_code, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fileList = new ArrayList<>();
        fileList.add(new FileData("File123",R.drawable.qr_code));
        fileList.add(new FileData("File123",R.drawable.qr_code));
        fileList.add(new FileData("File123",R.drawable.qr_code));

        fileAdapter = new FileAdapter(fileList);
        recyclerView.setAdapter(fileAdapter);
        return view;
    }
}