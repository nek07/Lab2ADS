import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList <String> array1 = new MyArrayList<String>();
        MyLinkedList <String> array2 = new MyLinkedList<>();
        array2.add("a");
        array2.add("b");
        array2.add("c");
        array2.add("d");
        System.out.println(array2.get(2));
        System.out.println(array2.remove("c"));
        System.out.println(array2.get(2));

    }
}