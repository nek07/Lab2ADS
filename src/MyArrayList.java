public class MyArrayList<T> implements MyList<T> {

    private Object[] arr;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        arr = new Object[capacity];
    }

    public void add(T item) {
        if (size == capacity) {
            capacity = (int) (capacity * 1.5);
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = item;
    }
    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return size;
    }

    @Override
    public int contains(Object o) {
        return 0;
    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void clear() {

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
}
