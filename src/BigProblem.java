import Fruit.Apple;
import Fruit.Box;
import Fruit.Orange;

public class BigProblem {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<Orange>(new Orange());
        Box<Apple> appleBox1 = new Box<Apple>();
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox1.getWeight());
        appleBox.move(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }
}
