package dependenceinversion;

/**
 * Created by lenovo on 2019/1/5.
 */
public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("FE");
    }
}
