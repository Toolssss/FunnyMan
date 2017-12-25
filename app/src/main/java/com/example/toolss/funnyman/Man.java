package com.example.toolss.funnyman;


import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;

public class Man {
    private float x,y;
    private Bitmap cadrs;
    private int w,h,nFrames;
    private Rect frame;
    private long prevTime;
    private long delay = 100;
    private float vx;


    public Man(float x, float y, Bitmap cadrs,int nFrames) {
        this.x = x;
        this.y = y;
        this.cadrs = cadrs;
        this.nFrames = nFrames;
        this.w = cadrs.getWidth()/nFrames;
        this.h = cadrs.getHeight();
        this.frame = new Rect(0,0,w,h);
        this.prevTime = System.currentTimeMillis();
        vx = 0;

    }

    Paint paint = new Paint();
    //void draw(Canvas canvas){
    //    canvas.drawCircle(x,y,30,paint);
    //}

    void update() {
        long nowTime = System.currentTimeMillis();
        if (nowTime - prevTime >= delay) {
            frame.left += w;
            frame.right += w;


            if (frame.right > cadrs.getWidth()) {
                frame.left = 0;
                frame.right = w;
            }
            prevTime = nowTime;
        }
        x += vx;
    }

    void draw(Canvas canvas){

        Rect frameTo = new Rect(
                (int)this.x-w/2,
                (int)this.y-h/2,
                (int)this.x+w/2,
                (int)this.y+h/2);
        canvas.drawBitmap(cadrs,frame,frameTo,paint);
    }

    void  touch(MotionEvent event){
        if (event.getX()>this.x){
            vx =1;
        }
        else {
            vx = -1;
        }
    }

}
