package com.example.toolss.funnyman;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

public class Man {
    private float x,y;

    public Man(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Paint paint = new Paint();
    void draw(Canvas canvas){
        canvas.drawCircle(x,y,30,paint);
    }

    void  touch(MotionEvent event){
        this.x = event.getX();
    }

}
