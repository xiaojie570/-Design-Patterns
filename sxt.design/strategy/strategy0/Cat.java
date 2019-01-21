package strategy.strategy0;


/**
 * Created by lenovo on 2019/1/21.
 */
public class Cat implements Comparable{
    private int height;
    private int weight;

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
        try {
            if(o instanceof Cat) {
                Cat cat = (Cat) o;
                if(this.getHeight() > cat.getHeight())
                    return 1;
                else if(this.getHeight() < cat.getHeight())
                    return -1;
                else
                    return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -100;
    }
}
