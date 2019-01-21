package strategy.strategy1;

/**
 * Created by lenovo on 2019/1/21.
 */
public class Dog{
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
    public String toString() {
        return "food: " + food + ";   ";
    }
}
