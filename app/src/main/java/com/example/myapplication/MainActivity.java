package com.example.myapplication;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    ReceiverFragment receiverFragment;
  SenderFragment senderFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiverFragment = new ReceiverFragment();
        senderFragment =  new SenderFragment();


    }


}