package com.example.androidlesson42;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;

    private ArrayList<Model> model = new ArrayList<>();

    public Adapter(ArrayList<Model> model) {
        this.model = model;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context =parent.getContext();

        return new ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Bind(model.get(position),context);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView= itemView.findViewById(R.id.image);

        }

        public void Bind(Model model, Context context) {
            textView.setText(model.getText());
            Glide.with(context).load(model.getImage()).into(imageView);
        }
    }
}
