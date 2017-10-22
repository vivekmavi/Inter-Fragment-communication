package com.example.paras.fragmentscommunication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentA extends Fragment implements Button.OnClickListener{

    Button button ;
    int counter;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_, container, false);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
        counter = 0 ;
        communicator = (Communicator) getActivity();

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.button)
        {
//           Toast.makeText(getActivity(), "button clivked", Toast.LENGTH_SHORT).show();
            counter++;
            communicator.respond("Button was clicked " + counter + "times");
        }
    }
}
