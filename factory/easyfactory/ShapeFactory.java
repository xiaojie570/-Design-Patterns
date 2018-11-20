package easyfactory;

/**
 * Created by lenovo on 2018/11/20.
 */
public class ShapeFactory {
    public static final String TAG = "ShapeFactory ";
    public static Shape getShape(String type) {
        Shape shape = null;
        if(type.equals("circle"))
            shape = new CircleShape();
        else if(type.equals("rect"))
            shape = new RectShape();
        else if(type.equals("triangle"))
            shape = new TriangleShape();

        return shape;
    }
}
