import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        MyArrayList <Integer> arrListInt = new MyArrayList<>();
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

        }

    }
}