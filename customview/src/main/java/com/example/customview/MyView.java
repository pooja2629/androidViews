package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

/**
 * Created by Pooja on 02-01-2018.
 */

public class MyView extends EditText {
    private Paint paint;

    private float cx, cy;

    public MyView(Context context) {
        super(context);
        init();
    }
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        canvas.drawCircle(cx, cy, 30, paint);
    }
    @Override

    public boolean onTouchEvent(MotionEvent event) {

        cx = event.getX();
        cy = event.getY();
        invalidate();
        return true;
    }
    private void init() {

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);

    }
}
