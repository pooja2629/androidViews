package com.example.customview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Pooja on 02-01-2018.
 */

public class MyView extends android.support.v7.widget.AppCompatTextView {
     private Paint paint;

     public  MyView (Context context){
         super(context);
         paint=new Paint();
         paint.setStrokeWidth(3f);
         paint.setColor(Color.RED);
     }
    public MyView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
        paint=new Paint();
        paint.setStrokeWidth(0.5f);
        paint.setColor(Color.BLACK);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //  canvas.drawCircle(100,50,100,paint);
        paint.setColor(Color.BLACK);
        for (int i=10;i<1000;i+=100){
            canvas.drawLine(10,i,getWidth(),i,paint);
        }
        paint.setColor(Color.RED);
        canvas.drawLine(200,0,200,getHeight(),paint);
    }
}
