package openclose;

/**
 * Created by lenovo on 2019/1/1.
 */

public class Main {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(10,"设计模式开闭原则", 350d);

        System.out.println("课程ID:" + javaCourse.getId() + "    课程名称：" + javaCourse.getName() + "   课程价格：" + javaCourse.getPrice());
    }
}
