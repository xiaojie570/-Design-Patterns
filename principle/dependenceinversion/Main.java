package dependenceinversion;

/**
 * Created by lenovo on 2019/1/5.
 */
public class Main {

    // v1
/*    public static void main(String[] args) {
        Fj fj = new Fj();
        fj.studyJavaCourse();
        fj.studyFECourse();
    }*/

    //v2
    /*public static void main(String[] args) {
        Fj fj = new Fj();
        fj.studyImoocCourse(new JavaCourse());
        fj.studyImoocCourse(new FECourse());
    }*/

    //v3
   /* public static void main(String[] args) {
        Fj fj = new Fj(new FECourse());
        fj.studyImoocCourse();
    }*/

    public static void main(String[] args) {
        Fj fj = new Fj();
        fj.setiCourse(new FECourse());
        fj.studyImoocCourse();
    }
}
