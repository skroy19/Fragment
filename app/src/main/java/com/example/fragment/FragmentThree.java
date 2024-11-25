package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor
    }

    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        //tv = findViewById()   --- this is not applicable because fragment can bind using view
        tv = view.findViewById(R.id.textViewBtn);

        //fragment er vitore activity use korle app er size kom bare compared to activity er vitore activity
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ekhane getContext() use korchi karon ei fragment jokhn jei activityr vitore use hobe
                //thokon sei activityr context pathabe.
                Intent intent = new Intent(getContext(),SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}