package com.example.midori.fragmentlearn;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    List tabFragmentList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for (int i=1;i<=0;i++){
            ActionBar.Tab tab = actionBar.newTab();
            tab.setText("Tab"+i);
            tab.setTabListener(this);
            actionBar.addTab(tab);
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        Fragment fragment = null;
        TabFragment tabFragment = null;

        if (tabFragmentList.size()>tab.getPosition()){
            fragment = (Fragment) tabFragmentList.get(tab.getPosition());
        }
        if (fragment == null){
            tabFragment = new TabFragment();
            Bundle bundle = new Bundle();
            int imgResId = 0;
            int colorResId = 0;
            switch (tab.getPosition()){
                case 0:
                    imgResId = getResources().getIdentifier(
                            "ic_launcher",
                            "mipmap",
                            "com.example.midori.fragmentlearn.app");
                    colorResId = R.color.color1;
                    break;
                case 1:
                    imgResId = getResources().getIdentifier(
                            "ic_launcher",
                            "mipmap",
                            "com.example.midori.fragmentlearn.app");
                    colorResId = R.color.color2;
                    break;
                case 2:
                    imgResId = getResources().getIdentifier(
                            "ic_launcher",
                            "mipmap",
                            "com.example.midori.fragmentlearn.app");
                    colorResId = R.color.color3;
                    break;
                default:
                    break;
            }
            bundle.putInt("image",imgResId);
            bundle.putInt("color",colorResId);
            tabFragment.setArguments(bundle);
            tabFragmentList.add(tabFragment);
        }
        else {
            tabFragment = (TabFragment) fragment;
        }
        ft.replace(android.R.id.content,tabFragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        if (tabFragmentList.size()>tab.getPosition()){
            ft.remove((Fragment) tabFragmentList.get(tab.getPosition()));
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
