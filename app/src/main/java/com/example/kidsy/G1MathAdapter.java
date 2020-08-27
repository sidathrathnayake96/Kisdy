package com.example.kidsy;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class G1MathAdapter extends RecyclerView.Adapter<G1MathAdapter.ViewHolder> {
    G1MathsData[] g1MathsData;

    private LayoutInflater layoutInflater;
    private List<String>activity;

    G1MathAdapter(Context context, List<String>activity){
        this.layoutInflater=LayoutInflater.from(context);
        this.activity=activity;




    }

    @NonNull
    @Override
    public G1MathAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=layoutInflater.inflate(R.layout.g1_maths_item_list,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



        final G1MathsData g1MathsDataList=g1MathsData[position];

        holder.textBookName1.setText(g1MathsDataList.getBookName());
        holder.textAuthorName1.setText(g1MathsDataList.getAuthorName());
        holder.textBookPrice1.setText(g1MathsDataList.getPrice());
        holder.BookImage1.setImageResource(g1MathsDataList.getBookImage());






    }



    @Override
    public int getItemCount() {
        return activity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView BookImage1;
        TextView textBookName1;
        TextView textAuthorName1;
        TextView textBookPrice1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);



            BookImage1=itemView.findViewById(R.id.G1MathsImageView1);
            textBookName1=itemView.findViewById(R.id.G1MathBookName1);
            textAuthorName1=itemView.findViewById(R.id.txtG1MathAuthor1);
            textBookPrice1=itemView.findViewById(R.id.txtG1MathPrice1);

        }
    }



}

