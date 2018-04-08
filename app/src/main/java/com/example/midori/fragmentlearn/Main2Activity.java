package com.example.midori.fragmentlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        TypedValue tv = new TypedValue();
//        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true))
//        {
//            int actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,getResources().getDisplayMetrics());
//            Log.d("Action bar ",actionBarHeight+"");
//        }
        switch (item.getItemId()) {
            case R.id.btn_exit:
                Toast.makeText(this,"Selected exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_search:
                Toast.makeText(this,"Selected Search",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_setting:
                Toast.makeText(this,"Select Setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_share:
                Toast.makeText(this,"Select Share",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
