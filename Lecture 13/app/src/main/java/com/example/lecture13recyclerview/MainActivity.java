package com.example.lecture13recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.style.LeadingMarginSpan;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<User> list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        User asad = new User(1,"Asad","20", "Isl");
        User ali = new User(2,"Ali", "23", "Lahore");
        User umer = new User(3,"Umer", "40", "Gujrawala");
        User nasir = new User(4,"Nasir","21","Peshawar");
        User shahid = new User(5,"Shahid", "19", "Karachi");

        list.addAll(Arrays.asList(new User[]{asad,ali,umer,nasir,shahid}));

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(list,MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}