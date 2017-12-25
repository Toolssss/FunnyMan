package com.example.toolss.funnyman;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private View view;
    private Bitmap pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(View)findViewById(R.id.View);
        pic = BitmapFactory.decodeResource(getResources(), R.drawable.cadrs);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Man man = new Man(200,200,pic,6);
        view.addMan(man);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
