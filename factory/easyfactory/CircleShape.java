package easyfactory;

/**
 * Created by lenovo on 2018/11/20.
 */
public class CircleShape implements Shape {
    public CircleShape() {
        System.out.println(" CircleShape: created");
    }

    @Override
    public void draw() {
        System.out.println("draw: CircleShape");
    }
}
