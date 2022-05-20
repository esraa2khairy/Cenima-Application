package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class cinemas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView er;

        er= findViewById(R.id.rv_main1);
        ArrayList<designfilm> p2 = new ArrayList<>();
        p2.add(new designfilm("Vox","-Rate:4.7","-Almaza city center",R.drawable.vox, (float) 4.7,"https://www.google.com/maps/dir/30.2293297,31.3203071/vox/@30.1545552,31.4464816,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x14583d0c045dab79:0x5ead4da702f5488e!2m2!1d31.3630643!2d30.0818484","cinemavox.class"));

        Recycler adpt = new Recycler(p2,this);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        er.setLayoutManager(lm);
        er.setAdapter(adpt);
        er.setHasFixedSize(true);

    }

}