package com.example.midori.fragmentlearn;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by midori on 2018/03/19.
 */

public class BottomFragment extends Fragment{
    private TextView topText;
    private TextView bottomText;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.activity_bottom, container,false);

        topText = (TextView)view.findViewById(R.id.tv_1);
        bottomText = (TextView)view.findViewById(R.id.tv_2);

        return view;
    }

    public void showText(String top_Text,String bottom_Text){
        topText.setText(top_Text);
        bottomText.setText(bottom_Text);
    }
}
