package com.example.midori.fragmentlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topText, String bottomText){
        BottomFragment bottomFragment = (BottomFragment)this.getFragmentManager().findFragmentById(R.id.bottom_fragment);
        bottomFragment.showText(topText,bottomText);
    }

}
