package com.example.myapplication;

import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.w3c.dom.Text;
import android.system.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReceiverFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReceiverFragment extends Fragment {
    SenderFragment senderFragment;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ReceiverFragment() {
        // Required empty public constructor
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReceiverFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReceiverFragment newInstance(String param1, String param2) {
        ReceiverFragment fragment = new ReceiverFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        senderFragment = new SenderFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receiver, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button Button = view.findViewById(R.id.receivebutton);
        View square = view.findViewById(R.id.square);
        View block = view.findViewById(R.id.block);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                square.animate()
                        .scaleX(1.5f)
                        .scaleY(1.5f)
                        .translationX(24)
                        .setDuration(400L)
                        .rotationX(2)
                        .setInterpolator(new AccelerateDecelerateInterpolator())
                        .start();


                block.animate()
                        .scaleY(6)
                        .translationY(80)
                        .translationX(24)
                        .scaleX(0.94f)
                        .setDuration(400L)
                        .setInterpolator(new AccelerateDecelerateInterpolator())
                        .start();
                square.setBackgroundColor(Color.parseColor("#FFFF2903"));






            }
        });


    }



}