import java.util.Arrays;

public class Switch<T> {

    private T[] arr;
    Switch(T[] arr){
        this.arr = arr;
    }
    public void change(){
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Integer[] test = {1,2};
//        System.out.println(Arrays.asList(test));
        Switch arr = new Switch<>(test);
        arr.change();
        System.out.println(Arrays.asList(test));

        String[] test1 = {"Hello", "World"};
//        System.out.println(Arrays.asList(test1));
        Switch arr1 = new Switch<>(test1);
        arr1.change();
        System.out.println(Arrays.asList(test1));

        Object[] test2 = {"Obj1", 2};
//        System.out.println(Arrays.asList(test2));
        Switch arr2 = new Switch<>(test2);
        arr2.change();
        System.out.println(Arrays.asList(test2));
    }
}
