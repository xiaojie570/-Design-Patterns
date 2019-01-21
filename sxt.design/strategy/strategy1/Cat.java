package strategy.strategy1;


import strategy.strategy0.*;

/**
 * Created by lenovo on 2019/1/21.
 */
public class Cat implements strategy.strategy0.Comparable{
    private int height;
    private int weight;

    private Comparator comparator = new CatWeightComparator();

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "height: " + height + " | " + "weight:" + weight + "     ";
    }




    @Override
    public int compareTo(Object o) {
        return comparator.compare(this,o);
    }
}
