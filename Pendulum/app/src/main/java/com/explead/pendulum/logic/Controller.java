package com.explead.pendulum.logic;

import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;

import com.explead.pendulum.app.App;

import java.util.ArrayList;

/**
 * Created by Александр on 02.01.2017.
 */
public class Controller {

    protected Circle centerCircle;
    protected Circle downCircle;
    protected ArrayList<Line> lines = new ArrayList<>();

    protected float circleSize;
    protected float widthLine;
    protected float height;

    private int angle;
    private float speed;
    private float T;

    public Controller() {
        circleSize = App.getWidthScreen()/38f;
        widthLine = circleSize*0.2f;

        height = App.getHeightScreen()*0.5f + App.getWidthScreen()*0.45f - App.getHeightScreen()*0.25f;
        float hp = (float)Math.sqrt(height*height + App.getWidthScreen()*App.getWidthScreen()*0.25f);
        angle = 90 - (int)Math.toDegrees(height/hp);
        T = (float)(2*Math.PI*Math.sqrt(height/10f));

        centerCircle = new Circle(App.getWidthScreen()*0.5f, App.getHeightScreen()*0.25f, widthLine, Color.BLACK);
        downCircle = new Circle(App.getWidthScreen()*0.5f, App.getHeightScreen()*0.5f + App.getWidthScreen()*0.45f, circleSize, Color.BLACK);

        createLinesDifferent();

    }

    private void createLinesNormal() {
        lines.clear();
        float value = height/8;
        for(int i = 1; i < 10; i++) {
            lines.add(new Line(centerCircle, new Circle(App.getWidthScreen()*0.5f, centerCircle.getY() + i*value, circleSize, Color.BLACK), Color.BLACK, circleSize));
        }
        lines.add(new Line(centerCircle, downCircle, Color.BLACK, circleSize));
    }

    private void createLinesDifferent() {
        lines.clear();
        float h = height;
        float sizeCircle = circleSize;
        for(int i = 1; i < 12; i++) {
            h = h*0.8f;
            sizeCircle = sizeCircle*0.97f;
            lines.add(new Line(centerCircle, new Circle(App.getWidthScreen()*0.5f, centerCircle.getY() + h, sizeCircle, Color.BLACK), Color.BLACK, circleSize));
        }
        lines.add(new Line(centerCircle, downCircle, Color.BLACK, circleSize));
    }

    public void onDrawLines(Canvas canvas) {
        for(int i = 0; i < lines.size(); i++) {
            lines.get(i).onDraw(canvas);
        }
    }

    public Circle getCenterCircle() {
        return centerCircle;
    }

    public Circle getDownCircle() {
        return downCircle;
    }

    public float getCircleSize() {
        return circleSize;
    }

    public float getHeight() {
        return height;
    }
}
