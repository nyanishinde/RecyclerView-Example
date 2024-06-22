package com.example.recycler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView chatRV;
    ArrayList<DataModelChats> arrChats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatRV=findViewById(R.id.chatsRV);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        chatRV.setLayoutManager(layoutManager);
        chatRV.setLayoutManager(new LinearLayoutManager(this));

        addChats();

        AdapterChats adapter = new AdapterChats(arrChats,MainActivity.this);
        chatRV.setAdapter(adapter);
    }

    private void addChats() {

        arrChats  = new ArrayList<>();
//        DataModelChats obj1 = new DataModelChats(R.drawable.aglanema_plant,"Gyaneshwar","Hello","10:00 AM");
//        arrChats.add(obj1);

        arrChats.add(new DataModelChats(R.drawable.aglanema_plant,"Gyaneshwar","Hello","10:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.areca_plam_tree,"Harsh","Hi","11:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.feng_shui_plant,"Harshika","Good morning","12:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.good_luck_jade_plant,"Gyaneshwar","Hello","10:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.lily_plant,"Harsh","Hi","11:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.money_plant,"Harshika","Good morning","12:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.oxycardium_black_plant,"Gyaneshwar","Hello","10:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.rosemary_plant,"Harsh","Hi","11:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.snake_plant,"Harshika","Good morning","12:00 AM"));
        arrChats.add(new DataModelChats(R.drawable.rosemary_plant,"Harsh","Hi","11:00 AM"));
    }
}