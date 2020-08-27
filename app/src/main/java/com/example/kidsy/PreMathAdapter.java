package com.example.kidsy;


import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PreMathAdapter extends RecyclerView.Adapter<PreMathAdapter.ViewHolder> {
    PreMathsData[] preMathsData;


    private LayoutInflater layoutInflater;
    private List<String>activity;

    PreMathAdapter(Context context, List<String>activity){
        this.layoutInflater=LayoutInflater.from(context);
        this.activity=activity;




    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view=layoutInflater.inflate(R.layout.pre_maths_item_list,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



        final PreMathsData preMathsDataList=preMathsData[position];

        holder.textBookName1.setText(preMathsDataList.getBookName());
        holder.textAuthorName1.setText(preMathsDataList.getAuthorName());
        holder.textBookPrice1.setText(preMathsDataList.getPrice());
        holder.BookImage1.setImageResource(preMathsDataList.getBookImage());


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



            BookImage1=itemView.findViewById(R.id.PreMathsImageView1);
            textBookName1=itemView.findViewById(R.id.PreMathBName1);
            textAuthorName1=itemView.findViewById(R.id.txtPreMathAuthor1);
            textBookPrice1=itemView.findViewById(R.id.txtG1MathPrice1);
        }
    }




}
