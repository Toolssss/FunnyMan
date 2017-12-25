package com.example.toolss.funnyman;


import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;

import java.sql.Array;
import java.util.ArrayList;

public class View extends android.view.View {
    private ArrayList<Man> objects = new ArrayList<>();

    public View(Context context) {
        super(context);
    }

    void addMan(Man man){
        objects.add(man);
    }

    public View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Man man : objects){
            man.draw(canvas);
            man.update();
        }

        invalidate();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for (Man man : objects){
            man.touch(event);
            man.update();
        }


        return super.onTouchEvent(event);
    }
}
