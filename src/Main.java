import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner scan = new Scanner(System.in);
    static MyArrayList<Integer> arrListInt = new MyArrayList<>();
    static MyArrayList<String> arrListStr = new MyArrayList<>();
    static MyLinkedList<String> linkListStr = new MyLinkedList<>();
    static MyLinkedList<Integer> linkListInt = new MyLinkedList<>();

    public static void main(String[] args) {
        arrListInt.add(10);
        arrListInt.add(20);
        arrListInt.add(30);
        printArrList();
        System.out.println();
        Integer[] arr = {1,2,3,4,5};

        arrListInt.addAll(1,arr);
        printArrList();
        System.out.println();
        linkListInt.add(10);
        linkListInt.add(20);
        linkListInt.add(30);
        printLinkedList();
        System.out.println();
        linkListInt.addAll(1,arr);
        printLinkedList();
    }
       /* boolean iteration = true;
        while (iteration) {
            System.out.println("1. ArrayList\n"+"2. LinkedList\n");
            int choice = scan.nextInt();
            System.out.println("1. add(int index)\n"+"2. add(T item, int index)\n"
                    +"3. size()\n"+"4. contains(T item)\n"+"5. remove(int index)\n"+"6. remove(T item)\n"+
                    "7. clear()\n"+"8. get(int index)\n"+"9. indexOf(T item)\n"+"10. lastIndexOf(T item)\n"
                    +"11. sort()\n"+ "12. leave");
            switch (choice){
                case 1:
                    while (iteration) {
                        int choice1 = scan.nextInt();
                        switch (choice1) {
                            case 1:
                                arrListInt.add(4);
                                arrListInt.add(1);
                                arrListInt.add(8);
                                arrListInt.add(7);
                                arrListInt.add(1);
                                break;
                            case 2:
                                System.out.println(arrListInt.get(3));
                                arrListInt.add(100, 3);
                                System.out.println(arrListInt.get(3));
                                break;
                            case 3:
                                System.out.println(arrListInt.size());
                                break;
                            case 4:
                                printArrList();
                                System.out.println("\n4 in arrayList = " + arrListInt.contains(4));
                                System.out.println("10 in arrayList = " + arrListInt.contains(10));
                                break;
                            case 5:
                                System.out.println("element which index = 3 : " + arrListInt.get(3));
                                System.out.println("Element which was removed = " + arrListInt.remove(3));
                                System.out.println("element which index = 3 : " + arrListInt.get(3));
                                break;
                            case 6:
                                arrListStr.add("banana");
                                arrListStr.add("apple");
                                arrListStr.add("orange");
                                for (int i = 0; i < arrListStr.size(); i++) {
                                    System.out.print(arrListStr.get(i)+ " ");
                                }
                                System.out.println("\nelement which index = 0 : " + arrListStr.get(0));
                                System.out.println(arrListStr.remove("banana"));
                                System.out.println("element which index = 0 : " + arrListStr.get(0));
                                break;
                            case 7:
                                System.out.println("size before - " + arrListInt.size());
                                arrListInt.clear();
                                System.out.println("size after - " + arrListInt.size());
                                break;
                            case 8:
                                printArrList();
                                System.out.println("\n" + arrListInt.get(1));
                                break;
                            case 9:
                                printArrList();
                                System.out.println();
                                System.out.println(arrListInt.indexOf(1));
                                break;
                            case 10:
                                printArrList();
                                System.out.println();
                                System.out.println(arrListInt.lastIndexOf(1));
                                break;
                            case 11:
                                printArrList();
                                arrListInt.sort();
                                printArrList();
                                break;
                            case 12:
                                iteration = false;
                                break;

                        }}
                    break;
                case 2:
                    while(iteration) {
                        int choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                linkListStr.add("a");
                                linkListStr.add("b");
                                linkListStr.add("c");
                                linkListStr.add("d");
                                linkListStr.add("a");
                                break;
                            case 2:
                                System.out.println(linkListStr.get(2));
                                linkListStr.add("g", 2);
                                System.out.println(linkListStr.get(2));
                                break;
                            case 3:
                                System.out.println(linkListStr.size());
                                break;
                            case 4:
                                printLinkedList();
                                System.out.println("\na in linkedList = " + linkListStr.contains("a"));
                                System.out.println("c in linkedList = " + linkListStr.contains("c"));
                                break;
                            case 5:
                                System.out.println("element which index = 2 : " + linkListStr.get(2));
                                System.out.println("Element which was removed = " + linkListStr.remove(2));
                                System.out.println("element which index = 2 : " + linkListStr.get(2));
                                break;
                            case 6:
                                printLinkedList();
                                System.out.println("\nelement which index = 1 : " + linkListStr.get(1));
                                System.out.println(arrListStr.remove("b"));
                                System.out.println("element which index = 1 : " + linkListStr.get(1));
                                break;
                            case 7:
                                System.out.println("size before - " + linkListStr.size());
                                break;
                            case 8:
                                printArrList();
                                System.out.println("\n" + linkListStr.get(0));
                                break;
                            case 9:
                                printArrList();
                                System.out.println();
                                System.out.println("first occurrence is "+linkListStr.indexOf("a"));
                                break;
                            case 10:
                                printLinkedList();
                                System.out.println();
                                System.out.println("last occurrence is "+linkListStr.lastIndexOf("a"));
                                break;
                            case 11:
                                linkListInt.add(5);
                                linkListInt.add(1);
                                linkListInt.add(2);
                                for (int i = 0; i < linkListInt.size(); i++) {
                                    System.out.print(linkListInt.get(i) + " ");
                                }
                                linkListInt.sort();
                                System.out.println();
                                for (int i = 0; i < linkListInt.size(); i++) {
                                    System.out.print(linkListInt.get(i) + " ");
                                }
                                break;
                            case 12:
                                iteration = false;
                                break;
                        }
                    }
                    break;
            }
        }

    }*/
    public static void printArrList(){
        for (int i = 0; i < arrListInt.size(); i++) {
            System.out.print(arrListInt.get(i) + " ");
        }
    }
    public static void printLinkedList(){
        for (int i = 0; i < linkListInt.size(); i++) {
            System.out.print(linkListInt.get(i) + " ");
        }
    }




}