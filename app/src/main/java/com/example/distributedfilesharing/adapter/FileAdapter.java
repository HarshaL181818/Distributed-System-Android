package com.example.distributedfilesharing.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.distributedfilesharing.R;
import com.example.distributedfilesharing.model.FileData;

import java.util.List;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.ViewHolder> {

    private List<FileData> fileList;

    public FileAdapter(List<FileData> fileList) {
        this.fileList = fileList;
    }
    @NonNull
    @Override
    public FileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FileAdapter.ViewHolder holder, int position) {
        FileData fileData = fileList.get(position);
        holder.textView4.setText(fileData.getFileId());
        holder.imageView2.setImageResource(fileData.getQrImageId());
    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView4;
        ImageView imageView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView4 = itemView.findViewById(R.id.textView4);
            imageView2 = itemView.findViewById(R.id.imageView2);
        }
    }
}
