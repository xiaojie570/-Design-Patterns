package easyfactory;

/**
 * Created by lenovo on 2018/11/20.
 */
public class RectShape implements Shape{

    public RectShape() {
        System.out.println("RectShape : created");
    }

    @Override
    public void draw() {
        System.out.println("draw: RectShape");
    }
}
