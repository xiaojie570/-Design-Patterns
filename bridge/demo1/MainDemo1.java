package demo1;

import demo1.com.paint.Black;
import demo1.com.paint.Color;
import demo1.com.paint.White;

import demo1.com.shape.Rectangle;
import demo1.com.shape.Shape;
import demo1.com.shape.Square;

/**
 * Created by lenovo on 2018/11/1.
 */
public class MainDemo1 {
    public static void main(String[] args) {
        // 白色
        Color white = new White();
        // 正方形
        Shape square = new Square();
        // 白色的正方形
        square.setColor(white);
        square.draw();

        // 长方形
        Shape rectange = new Rectangle();
        // 黑色的
        Color black = new Black();
        // 黑色的长方形
        rectange.setColor(black);
        rectange.draw();
    }
}
