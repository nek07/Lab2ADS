public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

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

    @Override
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

    @Override
    public boolean remove(T item) { //+++++++++++++++++
        int index=indexOf(item);
        checkIndex(index);
        if(index>=0){
            remove(index-1);
            size--;
            return true;
        }
        return false;
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
        this.size--;
        return ReturnValue; //value which was removed
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
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
        int index=indexOf(o);
        if(index==-1){
            return false;
        }
        else{
            return true;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private T getNode(int index) {
        MyNode current = head;
        checkIndex(index);
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return (T) current;
    }


}