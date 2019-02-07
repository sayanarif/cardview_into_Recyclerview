package com.example.user.qp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImagezViewHolder>{
 private Context context;
 private ArrayList<Image>images;

    public ImageAdapter(Context context, ArrayList<Image> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public ImagezViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.card_view,parent,false);

        return new ImagezViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagezViewHolder holder, int position) {
        holder.imageView.setImageResource(images.get(position).getQuoteimg());
        holder.title.setText(images.get(position).getImgname());

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ImagezViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;
    public ImagezViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.Quote_image);
        title = itemView.findViewById(R.id.title_view);
    }
}
}
