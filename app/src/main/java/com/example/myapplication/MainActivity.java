package com.example.myapplication;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;



public class MainActivity extends AppCompatActivity {

    ArrayList<ItemClass> items = new ArrayList<ItemClass>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.ItemList);
        ItemAdapter.OnStateClickListener stateClickListener = new ItemAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(ItemClass itemClass, int position) {




            }
        };
        ItemAdapter MyAdapter = new ItemAdapter(this, items,stateClickListener);

        recyclerView.setAdapter(MyAdapter);
    }

    private void setInitialData(){

        items.add(new ItemClass ("Евгений","Ершов","Екатеринбург"));
        items.add(new ItemClass ("Евгений","Ершов","Екатеринбург"));
        items.add(new ItemClass ("Евгений","Ершов","Екатеринбург"));
        items.add(new ItemClass ("Евгений","Ершов","Екатеринбург"));

    }


}