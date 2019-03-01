package com.example.familia.paginaf;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class AccesibleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_accesible,container,   false );


    }
}
   // Button button;
    //Activity activity;
    //@Nullable
    //@Override

      //public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


      //  View view= inflater.inflate(R.layout.fragment_agregar,container,false);
       // button=(Button)view.findViewById(R.id.button);

        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  activity=getActivity();
                //Toast.makeText(activity,"agregado",Toast.LENGTH_LONG).show();

            //}
             //});

    //return view;

//}




