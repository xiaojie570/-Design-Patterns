package prototype.prototype_2;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("佩奇",date);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);

        pig.getBirthDay().setTime(6666L);
        System.out.println(pig);
        System.out.println(pig1);
    }
}
