//1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//2. Написать метод, который преобразует массив в ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Switch<T> {

    private T[] arr;
    private Switch(T[] arr){
        this.arr = arr;
    }
    private void change(){
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    private ArrayList<T> toArrList(T[] arr){
        ArrayList<T> answer = new ArrayList<>(Arrays.asList(arr));
        return answer;
    }

    public static void main(String[] args) {
        Integer[] test = {1,2};
        Switch<Integer> arr = new Switch<>(test);
        arr.change();
        List<Integer> arrayList = new ArrayList<>(arr.toArrList(test));

        String[] test1 = {"Hello", "World"};
        Switch<String> arr1 = new Switch<>(test1);
        arr1.change();
        List<String> arrayList1 = new ArrayList<>(arr1.toArrList(test1));


        Object[] test2 = {"Obj1", 2};
        Switch<Object> arr2 = new Switch<>(test2);
        arr2.change();
        List<Object> arrayList2 = new ArrayList<>(arr2.toArrList(test2));

    }
}
