package com.explead.pendulum.logic;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Александр on 02.01.2017.
 */
public class Circle {

    private float x;
    private float y;

    private float radius;
    private int color;

    private Paint paintCircle;

    public Circle(float x, float y, float size, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = size/2;
        createPaint();
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paintCircle);
    }

    public void createPaint() {
        paintCircle = new Paint();
        paintCircle.setColor(color);
        paintCircle.setAntiAlias(true);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}