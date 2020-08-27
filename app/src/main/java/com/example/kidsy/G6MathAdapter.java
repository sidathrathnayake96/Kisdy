package com.example.kidsy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class G6MathAdapter extends RecyclerView.Adapter<G6MathAdapter.ViewHolder> {

    ViewGroup viewGroup;
    ViewHolder viewHolder;

    private LayoutInflater layoutInflater;
    private List<String>data;

     G6MathAdapter(Context context,List<String>data){
    this.layoutInflater=LayoutInflater.from(context);
    this.data=data;

     }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i ) {

        View view=layoutInflater.inflate(R.layout.g6_maths_custom_view,viewGroup,false);

         

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

         String title=data.get(i);


        viewHolder.textBookName1.setText(title);





    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView textBookName1;
        TextView textAuthorName1;
        TextView textBookPrice1;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i =new Intent(v.getContext(),G6MathsDetails.class);
                    i.putExtra("title",data.get(getAdapterPosition()));
                    v.getContext().startActivity(i);

                }
            });


            textBookName1=itemView.findViewById(R.id.G6MathBookName1);
            textAuthorName1=itemView.findViewById(R.id.G6MathAuthorName1);
            textBookPrice1=itemView.findViewById(R.id.G6MathPrice1);


        }
    }
}
