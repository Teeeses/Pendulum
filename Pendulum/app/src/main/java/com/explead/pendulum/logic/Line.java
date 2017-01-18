package com.explead.pendulum.logic;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Александр on 04.01.2017.
 */
public class Line {

    private Circle centerCircle;
    private Circle downCircle;

    private int color;

    private Paint paintCircle;

    private float width;

    public Line(Circle centerCircle, Circle downCircle, int color, float width) {
        this.centerCircle = centerCircle;
        this.downCircle = downCircle;
        this.color = color;
        this.width = width;
        createPaint();
    }


    public void onDraw(Canvas canvas) {
        canvas.drawLine(centerCircle.getX(), centerCircle.getY(), downCircle.getX(), downCircle.getY(), paintCircle);
        downCircle.onDraw(canvas);
    }

    public void createPaint() {
        paintCircle = new Paint();
        paintCircle.setColor(color);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(width*0.2f);
    }

    public Circle getCenterCircle() {
        return centerCircle;
    }

    public void setCenterCircle(Circle centerCircle) {
        this.centerCircle = centerCircle;
    }

    public Circle getDownCircle() {
        return downCircle;
    }

    public void setDownCircle(Circle downCircle) {
        this.downCircle = downCircle;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Paint getPaintCircle() {
        return paintCircle;
    }

    public void setPaintCircle(Paint paintCircle) {
        this.paintCircle = paintCircle;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
