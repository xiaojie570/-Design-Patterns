package strategy;

/**
 * Created by lenovo on 2019/1/21.
 */
public class Dog implements Comparable{
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Dog) {
            Dog dog = (Dog) o;
            if(this.getFood() > dog.getFood())
                return 1;
            else if(this.getFood() < dog.getFood())
                return -1;
            else
                return 0;
        }
        return -100;
    }

    @Override
    public String toString() {
        return "food: " + food + ";   ";
    }
}
