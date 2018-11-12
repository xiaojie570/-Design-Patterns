package demo1.com.shape;

import demo1.com.paint.Color;

/**
 * 画的形状.
 */
public abstract class Shape {
    // 使用的颜色
    Color color;
    // 设置颜色
    public void setColor(Color color){
        this.color = color;
    }
    // 使用颜色画图
    public abstract void draw();
}
