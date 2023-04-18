import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList <String>  array1 = new MyArrayList<String>();
        MyLinkedList <Integer> array2 = new MyLinkedList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        System.out.println(array2.remove(2));
        System.out.println(array2.get(2));


    }
}