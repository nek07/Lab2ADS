public interface MyList<T> {
    int size();
    int contains(Object o);
    void add(T item);
    void add(T item, int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get();
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();
}
