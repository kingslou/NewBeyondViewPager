package com.toaker.newbeyondviewpager.demo;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
/**
 * Created by luchao on 2015/5/13.
 * 呵呵哒
 */


public class CardView extends View
{
    private Bitmap[] mCards = new Bitmap[3];

    private int[] mImgId = new int[]{};

    public CardView(Context context)
    {
        super(context);

        Bitmap bm = null;
        for (int i = 0; i < mCards.length; i++)
        {
            bm = BitmapFactory.decodeResource(getResources(), mImgId[i]);
            mCards[i] = Bitmap.createScaledBitmap(bm, 400, 600, false);
        }

        setBackgroundColor(0xff00ff00);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {

        super.onDraw(canvas);

        canvas.save();
        canvas.translate(20, 120);
        for (Bitmap bitmap : mCards)
        {
            canvas.translate(120, 0);
            canvas.drawBitmap(bitmap, 0, 0, null);
        }
        canvas.restore();

    }
}
