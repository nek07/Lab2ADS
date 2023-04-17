public class MyArrayList<T> implements MyList<T> {

    private Object[] arr;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        arr = new Object[capacity];
    }

    public void add(T item) {
        if(size==capacity)
            increseBuffer();
        arr[size++] = item;
    }

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

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                return true;
            }
        }
        return false;
    }

    @Override
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

    @Override
    public boolean remove(T item) {
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

    @Override
    public T remove(int index) {
        T element = (T) arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return element;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i<size; i++){
        if(o==arr[i])
            return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index=-1;
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                index=i;
            }
        }
        return index;
    }

    @Override
    public void sort() {

    }
}
