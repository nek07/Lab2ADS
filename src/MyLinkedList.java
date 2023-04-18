public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T newItem) {
        MyNode newNode = new MyNode(newItem);
        if (head == null) {
            head = newNode;
        } else {
            MyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void add(T item, int index) {
        MyNode newNode = new MyNode(item);
        MyNode prevNode = new MyNode(item);
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

    @Override
    public boolean remove(T item) {
        return true;
    }

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
        size--;
        return ReturnValue; //value which was removed
    }

    @Override
    public void clear() {

    }

    public T get(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.data;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private T getNode(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current;
    }


}