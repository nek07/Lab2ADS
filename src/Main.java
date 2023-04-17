import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList <String>  array1 = new MyArrayList<String>();
        array1.add("kick");
        array1.add("magazine");
        array1.add("moscow");
        array1.add("boxing club");
        System.out.println(array1.remove("again"));
        System.out.println(array1.get(2));


    }
}