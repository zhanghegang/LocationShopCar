package zhanghegang.com.bawei.yuekaolianxi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by asus on 2017/10/25.
 */

public class DrawCicle extends View {

    private int radius;
    private int ciclr_bg;

    public DrawCicle(Context context) {
        this(context,null);
    }

    public DrawCicle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public DrawCicle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.DrawCicle);
        radius = typedArray.getDimensionPixelSize(R.styleable.DrawCicle_radius, 40);
        int color = getResources().getColor(R.color.colorPrimary);
        ciclr_bg = typedArray.getColor(R.styleable.DrawCicle_cicrl_bg, color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);//抗锯齿
        paint.setColor(ciclr_bg);
        canvas.drawCircle(radius, radius, radius, paint);
    }
}
