package com.example.myapplication;

import android.app.Activity;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton Call = findViewById(R.id.call_button);
        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Абонент не доступен", Toast.LENGTH_SHORT).show();
            }
        });
        FloatingActionButton Message = findViewById(R.id.message_button);
        Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Абонент не доступен", Toast.LENGTH_SHORT).show();
            }
        });
        FloatingActionButton Videocall = findViewById(R.id.videocall_button);
        Videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Абонент не доступен", Toast.LENGTH_SHORT).show();
            }
        });


    }


}