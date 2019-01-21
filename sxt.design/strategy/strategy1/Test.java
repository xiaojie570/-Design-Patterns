package strategy.strategy1;


/**
 * Created by lenovo on 2019/1/21.
 */
// 冒择路兮快归堆
public class Test {
    public static void main(String[] args) {
        //int[] a = {9, 5, 3, 7, 1};
        Cat[] cats = {new Cat(101,1),new Cat(2,3),new Cat(5,5)};
        //strategy.strategy0.Dog[] dogs = {new strategy.strategy0.Dog(3),new strategy.strategy0.Dog(2),new strategy.strategy0.Dog(10),new Dog(1)};
        DataSorter.sort(cats);
        DataSorter.print(cats);
    }
}
