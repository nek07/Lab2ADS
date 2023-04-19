public class MyNode<T> {
    T data;
    MyNode next;

    /*
      @MyNode() - constructor which create node.
      @T data - generic type data. Contains any type of data.
      @return void
     */
    public MyNode(T data) {
        this.data= data;
        next = null;
    }
}
