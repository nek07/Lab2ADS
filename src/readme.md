# Assignment2 Documentation

### assignment2.java
# MyArrayList
### ➕ increaseBuffer
**Description**: It creates a new array with twice the length of the current array, copies the elements of the old array to the new array, and replaces the old array with the new array. `O(n)`

```java
private void increseBuffer() {
        if (size == capacity) {
            capacity = (int) (capacity * 1.5);
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            }
}
```
### ➕ size
**Description**: return the size of arraylist. `O(n)`

```java
public int size() {
    if(index < 0 || index>=size){
        throw new IndexOutOfBoundsException();
    }
    return this.size;
}

```
### ➕ add
**Description**: Appends the specified element to the end of this list and increase the `size` of arraylist if it needed. `O(n)`

```java
public void add(T item) {
        if(size==capacity)
            increseBuffer();
        arr[size++] = item;
    }

```
### ➕ add
**Description**: Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices). `O(n)`

```java
public void add(T item, int index) {
        if (size == capacity) {
            increseBuffer();
            }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;

        }

```
### ➕ get
**Description**: get the element by index. `O(1)`

```java
public T get(int index) {
        return (T) arr[index];
    }

```
### ➕ contains
**Description**: checks is the element is in arraylist or not. `O(n)`

```java
public boolean contains(Object o) {
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                return true;
            }
        }
        return false;
        }

```
### ➕ remove
**Description**: Removes the element at the specified position in this list. Shifts any subsequent elements to the left. `O(n)`

```java
public T remove(int index) {
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        T element = (T) arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return element;
        }

```
### ➕ remove
**Description**: Removes the first occurrence of the specified element from this list and return `true`, if it is present. If the list does not contain the element, return `false`. `O(n)`

```java
public boolean remove(T item){
       int index = -1;
        boolean answer = false;
        for (int i = 0; i < size; i++) {
            if(item==arr[i]){
                index=i;
                answer=true;
                break;
            }
        }
        if(index>=0)
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
        return answer;
    }

```
### ➕ clear
**Description**: Delete all the elements in an arraylist. `O(1)`

```java
public void clear() {
        this.arr = (T[]) new Object[5];
        size=0;
        }
```
### ➕ indexOf
**Description**: Find the element's index if this element exist in an array and return it, otherwise return -1. `O(n)`

```java
public int indexOf(Object o) {
        for(int i = 0; i<size; i++){
            if(o==arr[i])
                return i;
        }
        return -1;
        }
```
### ➕  lastIndexOf
**Description**: Find the last occurence of the element in an array and return the index of an element, otherwise return -1. `O(n)`

```java
   public int lastIndexOf(Object o) {
        int index=-1;
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                index=i;
            }
        }
        return index;
        }
```
### ➕ sort
**Description**: Sort the arraylist's elements in ascending order (only integer type elements). 

```java
 public void sort() {
        Arrays.sort(arr);
        }
```
# MyLinkedList
### ➕ get
**Description**: This function returns the element at the given index in the linked list. `O(n)`

```java
public T get(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.data;
        }
```
### ➕ size
**Description**: This method returns the number of elements in the list. `O(1)`

```java
public int size() {
        return this.size;
    }
```
### ➕ add
**Description**: This method add the element in the end of LinkedList. `O(1)`

```java
public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next=newNode;
            tail = newNode;
        }
        size++;
    }
```
### ➕ add
**Description**: This method add the element at specified position by changing node's positions and their pointers. `O(n)`

```java
public void add(T item, int index) {
        MyNode<T> newNode = new MyNode<>(item);
        MyNode<T> prevNode = new MyNode<>(item);
        checkIndex(index);
        if (head == null) {
            head = newNode;
        } else {
            prevNode = head;
            getNode(index);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }
```
### ➕ indexOf
**Description**: Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. `O(n)`

```java
public int indexOf(Object o) {
        int index=-1;
        for(int i=0;i<size;i++){
            if(head.data==o){
                index++;
                break;
            }
            else{
                head = head.next;
                index++;
            }
        }
        return index;
    }
```
### ➕ remove
**Description**: Removes the element at the specified position in this list. Shifts any subsequent elements to the left. `O(n)`

```java
public T remove(int index) {
        checkIndex(index); //exception
        T ReturnValue;
        if (index == 0) {
            ReturnValue = head.data;
            head = head.next;}
        else {
            MyNode<T> before = (MyNode<T>) getNode(index-1); 
            ReturnValue = (T) before.next.data; 
            before.next = before.next.next;
        }
        this.size--;
        return ReturnValue; 
        }
```
### ➕ remove
**Description**: Removes the first occurrence of the specified element from this list, if it is present. If this list does not contain the element, it is unchanged. More formally, removes the element with the lowest index `i`. `O(n)`

```java
    public boolean remove(T item) {
        int index=indexOf(item);
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> before = (MyNode<T>) getNode(index-1);
            before = before.next;

        }
        size--;
        return false;
    }
```
### ➕ lastIndexOf
**Description**: Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. `O(n)`

```java
public int lastIndexOf(Object o) {
        int index=-1;
        int lastOcc=index;
        for(int i=0;i<size;i++){
            if(head.data==o){
                index++;
                lastOcc=index;
            }
            else{
                head = head.next;
                index++;
            }
        }
        return lastOcc;
    }
```
### ➕ contains
**Description**: Checks is the linkedList contains the specified element or not. Respectively, returns `true` or `false`. `O(n)`

```java
 public boolean contains(Object o) {
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
```
### ➕ clear
**Description**: Delete all the elements from LinkedList. `O(1)`

```java
public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
```
### ➕ sort
**Description**: Sorts LinkedList in the ascending order (only integer type). `O(n)`

```java

```


