package com.example.toolss.funnyman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(View)findViewById(R.id.View);

    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Man man = new Man(200,200);
        view.addMan(man);
    }
}
