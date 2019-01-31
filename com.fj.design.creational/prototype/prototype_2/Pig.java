package prototype.prototype_2;

import java.util.Date;

/**
 * 浅克隆
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthDay;

    public Pig(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", date=" + birthDay +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /*Pig pig = (Pig) super.clone();
        // 深克隆
        pig.birthDay = (Date) pig.birthDay.clone();
        return pig;*/

        return super.clone();
    }
}
