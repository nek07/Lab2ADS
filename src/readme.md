# Assignment2 Documentation

### assignment2.java

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
