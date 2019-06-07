package Fruit;


import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    ArrayList<T> arr;
     public Box(T...fruits){
         this.arr = new ArrayList<>(Arrays.asList(fruits));
     }

     public double getWeight(){
         if(!arr.isEmpty()){
            return arr.get(0).weight * arr.size();

         }
         return 0.0;
     }

     public void addSome(T...fruits){
         arr.addAll(Arrays.asList(fruits));
     }

     public boolean compare(Box box){
         return (this.getWeight() == box.getWeight());
     }

     public void move(Box<? super T> box){
         box.arr.addAll(this.arr);
         this.arr.clear();
     }



}
