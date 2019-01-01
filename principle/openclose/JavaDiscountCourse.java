package openclose;

/**
 * Created by lenovo on 2019/1/1.
 * 对接口和基类是关闭的
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrince() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        // 如果想要做分区间的活动，可以在这个方法中进行修改
        return super.getPrice() * 0.8;
    }
}
