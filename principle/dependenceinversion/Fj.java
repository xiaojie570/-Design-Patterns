package dependenceinversion;

/**
 * Created by lenovo on 2019/1/5.
 */
public class Fj {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


    public void studyImoocCourse( ) {
        iCourse.studyCourse();
    }

}
