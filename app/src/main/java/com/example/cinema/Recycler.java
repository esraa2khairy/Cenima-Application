package com.example.cinema;
import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class Recycler extends RecyclerView.Adapter<Recycler.filmViewholder> {
    ArrayList<designfilm> films;
    Context mContext;
    public Recycler(ArrayList<designfilm> films,Context context) {
        this.films = films;
        this.mContext=context;
    }
    @NonNull
    @Override
    public filmViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Toast.makeText(RecyclerAdapter.this,"yeeehhhhhhhh!",Toast.LENGTH_LONG).show();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.designfilm,null,false);
        filmViewholder viewholder = new filmViewholder(v);
        return viewholder;
    }
    @Override
    public void onBindViewHolder(@NonNull filmViewholder holder, int position) {
        designfilm f = films.get(position);
        holder.iv.setImageResource(f.getImg1());
        holder.k.setRating(f.getRatebar());
        holder.tv2.setText(f.getTitle());
        holder.tv3.setText(f.getRating());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StateListAnimator stateListAnimator = AnimatorInflater
                    .loadStateListAnimator(mContext, R.drawable.animation);
            holder.b1.setStateListAnimator(stateListAnimator);
            holder.b1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse(f.getLink()));
                    mContext.startActivity(u);
                }
            });
            holder.c1.animate().alpha(1f).setDuration(30000).start();
            holder.c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse(f.getCard()));
                    mContext.startActivity(u);
                }
            });
        }}
    @Override
    public int getItemCount() {
        return films.size();
    }
    // class view holder
    class filmViewholder extends RecyclerView.ViewHolder{
        TextView tv2 , tv3 ;
        ImageView iv;
        Button b1 ;
        RatingBar k;
        CardView c1;
        public filmViewholder(@NonNull View itemView) {
            super(itemView);
            tv2 = itemView.findViewById(R.id.textView33);
            k=itemView.findViewById(R.id.ratingBar22);
            tv3 = itemView.findViewById(R.id.textView66);
            iv= itemView.findViewById(R.id.imageView88);
            b1 = itemView.findViewById(R.id.map_max39);
             c1 = itemView.findViewById(R.id.cardview1);
        }

    }


}

 /*   Button f = findViewById(R.id.button2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                StateListAnimator stateListAnimator = AnimatorInflater
                .loadStateListAnimator(this, R.drawable.animation);
                f.setStateListAnimator(stateListAnimator);
                f.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


         Intent u = new Intent(mContext, MainActivity5.class);
               mContext.startActivity(u);
        }

        });
        }*/