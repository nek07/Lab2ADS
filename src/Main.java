import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        MyArrayList <Integer> arrListInt = new MyArrayList<>();
        MyArrayList <String> arrListStr = new MyArrayList<>();
        MyLinkedList <String> linkListStr = new MyLinkedList<>();
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                arrListInt.add(4);
                arrListInt.add(1);
                arrListInt.add(8);
                arrListInt.add(7);
                arrListInt.add(2);
                break;
            case 2:
                System.out.println(arrListInt.get(3));
                arrListInt.add(100,3);
                System.out.println(arrListInt.get(3));
                break;
            case 3:
                arrListInt.size();
                break;
            case 4:
                for(int i = 0; i< arrListInt.size();i++){
                    System.out.print(arrListInt.get(i));
                }
                arrListInt.contains(4);
                arrListInt.contains(10);
                break;
            case 5:
                System.out.println("element which index = 3 : "+arrListInt.get(3));
                System.out.println("Element which was removed = "+arrListInt.remove(3));
                System.out.println("element which index = 3 : "+arrListInt.get(3));
                break;
            case 6:
                arrListStr.add("banana");
                arrListStr.add("apple");
                for(int i = 0; i < arrListStr.size();i++){
                    System.out.print(arrListStr.get(i));
                }
                System.out.println("element which index = 0 : "+arrListStr.get(0));
                System.out.println(arrListStr.remove("banana"));
                System.out.println("element which index = 0 : "+arrListInt.get(0));
                break;

        }

    }
}