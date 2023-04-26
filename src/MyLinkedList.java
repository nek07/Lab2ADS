import org.w3c.dom.Node;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;
    /*
        @MyLinkedList() - contractor of this class
        @noParameters
        @return void
    */
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    /*
        @add() - add new element at the end of LinkedList.
        @T newItem - element which will be added in LinkedList.
        @MyNode - class which helps to create and connect nodes.
        @return void
    */
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
    /*
        @add() - add the element in specified index of LinkedList.
        @T item - element which will be added in LinkedList.
        @int index - specified place in LinkedList
        @return void
    */
    @Override
    public void add(T item, int index) {
        MyNode<T> newNode = new MyNode<>(item);
        MyNode<T> prevNode= new MyNode<>(item);
        checkIndex(index);
        if (head == null) {
            head = newNode;
        } else {
            prevNode = (MyNode<T>) getNode(index-1);
            newNode.next = prevNode.next; //make new connection between elements
            prevNode.next = newNode; //add new element in spec-place

        }
    }
    /*
        @remove() - delete the item in LinkedList
        @T item - the element which will be removed from linkedList(generic type)
        @checkIndex() - method which calls OutOfBound exception
        @MyNode - class which helps to manage the connections and effectivity in LinkedList
        @return boolean - if successfully removed true, otherwise false
    */
    @Override
    public boolean remove(T item) {
        int index=indexOf(item);
        checkIndex(index); //exception
        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> before = (MyNode<T>) getNode(index-1); //take the element before index's value
            before = before.next; //connect the element before and after specified index
            return true;
        }
        size--;
        return false;
    }
    /*
        @remove() - delete the item in LinkedList
        @int index - the index of element which will be removed from linkedList
        @return int - element which was removed.
    */
    @Override
    public T remove(int index) {
        checkIndex(index); //exception
        T ReturnValue;
        if (index == 0) {
            ReturnValue = head.data;
            head = head.next;
        } else {
            MyNode<T> before = (MyNode<T>) getNode(index-1); //take the element before index's value
            ReturnValue = (T) before.next.data; //set value which will be returned.
            before.next = before.next.next; //connect the element before and after specified index

        }
        this.size--;
        return ReturnValue; //value which was removed
    }
    /*
        @clear() - delete all the elements
        @noParameters
        @return void
    */
    @Override
    public void clear() {
        this.head = null; //destroy all the connections
        this.tail = null;
        this.size = 0;
    }
    /*
        @get() - get the element by index from LinkedList O(n)
        @int index - index of element in LinkedList
        @return T - generic type element (any type)
    */
    public T get(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.data;
    }
    /*
        @indexOf() - Return the index of an element
        @Object o - element of LinkedList
        @return int - return the index of an element
    */
    @Override
    public int indexOf(Object o) {
        int index=-1;
        for(int i=0;i<size;i++){
            if(o.equals(head.data)){
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

    /*
        @lastIndexOf() - Returns the index of the last occurrence of the specified element
        @Object o - element of LinkedList
        @return int - return the index of an element
    */
    @Override
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
    /*
        @sort() - sort the array in ascending order (only integer)
        @noParameters
        @return void
    */
    @Override
    public void sort() {
        MyNode current = head;
        MyNode index = null;
        T temp;
        if(head==null){
            return;
        }
        else{
            while(current!=null){
                index=current.next;
                while(index!=null){
                    if((int)current.data>(int)index.data){
                        temp= (T) index.data;
                        index.data = current.data;
                        current.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
    }
    /*
        @size() - return the size of LinkedList
        @noParameters
        @return int - size of LinkedList
    */
    public int size() {
        return size;
    }
    /*
        @contains() - checks that is the element in linkedList or not
        @noParameters
        @return boolean
    */
    @Override
    public boolean contains(Object o) {
        int index=indexOf(o);
        if(index==-1){
            return false;
        }
        else{
            return true;
        }
    }
    /*
            @checkIndex - additional method which helps to determine is the index of LinkedList exist or not
            @int index - index of LinkedList
            @IndexOutOfBoundsException()- exception which checks is the index greater than size or smaller than 0
            @return void
    */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(); //exception
        }
    }
    /*
            @getNode() - additional method which helps to get the additional node to make processes faster.
            @int index - index of LinkedList
            @checkIndex() - IndexOutOfBoundsException exception, helps to control index and loop
            @return generic type
    */
    private T getNode(int index) {
        MyNode current = head;
        checkIndex(index);
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return (T) current;
    }
    /*
      @addAll - function which add list of data at specified index.
      @int index - specified index.
      @T[] list - contain elements which will be added.
      @checkIndex - checks is the element at this place null or not.(IndexOutOfBoundException)
      @return void.
     */
    public void addAll(int index, T[] list) {
        for (int i = 0; i < list.length; i++) {
            MyNode<T> newNode = new MyNode<>(list[i]);
            MyNode<T> prevNode = new MyNode<>(list[i]);
            checkIndex(index);
            if (head == null) {
                head = newNode;
            } else {
                prevNode = (MyNode<T>) getNode(index - 1);
                newNode.next = prevNode.next;
                prevNode.next = newNode;

            }
            index++;
            size++;
        }
    }

}