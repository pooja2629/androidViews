package com.example.bouncingball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.TextView;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Pooja on 15-01-2018.
 */

public class BallView extends TextView {

    private Paint paint;
    private class Ball{
        int x=5, y=5;
        int rad=40;
        int dx=5, dy=5;
    }
    private Ball ball;

    public BallView(Context context) {
        super(context);
        ball= new Ball();
        paint =new Paint();
        paint.setColor(Color.BLUE);


        ballMover()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(integers -> invalidate())
                .subscribe();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(ball.x,ball.y,ball.rad,paint);
    }
    public Flowable<Integer[]> ballMover(){
        return Flowable.create(sub -> {
            while (true){
            if (ball.x<0)ball.dx=5;
            if (ball.x>=getWidth())ball.dx=-5;
                if (ball.y<0)ball.dy =5;
                if (ball.y>=getWidth())ball.dy=-5;

                ball.x += ball.dx;
                ball.y += ball.dy;
                Thread.sleep(10);
                sub.onNext(new Integer[]{ball.x, ball.y});
            }
        }, BackpressureStrategy.BUFFER);
    }
}
