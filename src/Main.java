import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);
    static MyArrayList <Integer> arrListInt = new MyArrayList<>();
    static MyArrayList <String> arrListStr = new MyArrayList<>();
    static MyLinkedList <String> linkListStr = new MyLinkedList<>();
    public static void main(String[] args) {
    while(true){
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                arrListInt.add(4);
                arrListInt.add(1);
                arrListInt.add(8);
                arrListInt.add(7);
                arrListInt.add(1);
                break;
            case 2:
                System.out.println(arrListInt.get(3));
                arrListInt.add(100,3);
                System.out.println(arrListInt.get(3));
                break;
            case 3:
                System.out.println(arrListInt.size());
                break;
            case 4:
                printArrList();
                System.out.println("\n4 in arrayList = "+arrListInt.contains(4));
                System.out.println("10 in arrayList = "+arrListInt.contains(10));
                break;
            case 5:
                System.out.println("element which index = 3 : "+arrListInt.get(3));
                System.out.println("Element which was removed = "+arrListInt.remove(3));
                System.out.println("element which index = 3 : "+arrListInt.get(3));
                break;
            case 6:
                arrListStr.add("banana");
                arrListStr.add("apple");
                arrListStr.add("orange");
                for(int i = 0; i < arrListStr.size();i++){
                    System.out.print(arrListStr.get(i));
                }
                System.out.println("\nelement which index = 0 : "+arrListStr.get(0));
                System.out.println(arrListStr.remove("banana"));
                System.out.println("element which index = 0 : "+arrListStr.get(0));
                break;
            case 7:
                System.out.println("size before - "+arrListInt.size());
                arrListInt.size();
                System.out.println("size after - "+arrListInt.size());
                break;
            case 8:
                printArrList();
                System.out.println("\n"+arrListInt.get(0));
                break;
            case 9:
                printArrList();
                System.out.println(arrListInt.indexOf(1));
                break;
            case 10:
                printArrList();
                System.out.println(arrListInt.lastIndexOf(1));
                break;
            case 11:
                printArrList();
                arrListInt.sort();
                printArrList();
                break;
        }}

    }
    public static void printArrList(){
        for(int i = 0; i < arrListInt.size();i++){
            System.out.print(arrListInt.get(i)+ " ");
        }
    }
    public static void printLinkedList(){
        for(int i = 0; i < linkListStr.size();i++){
            System.out.print(linkListStr.get(i)+ " ");
        }
    }

}