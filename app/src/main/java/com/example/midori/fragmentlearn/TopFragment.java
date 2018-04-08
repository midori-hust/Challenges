package com.example.midori.fragmentlearn;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by midori on 2018/03/19.
 */

public class TopFragment extends Fragment{
    private EditText edt1;
    private EditText edt2;

    private MainActivity mainActivity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater,container,savedInstanceState);

        View view = inflater.inflate(R.layout.activity_top,container,false);

        edt1 = (EditText)view.findViewById(R.id.edt1);
        edt2 = (EditText)view.findViewById(R.id.edt2);
        Button applyButton = (Button)view.findViewById(R.id.btn_submit_from_top);


        return view;
    }
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.d("test log","in here");
            this.mainActivity = (MainActivity)activity;
    }

}
