public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;
    public MyLinkedList(){
        head=null;
        size=0;
    }
    public void add(T newItem){
        MyNode newNode = new MyNode(newItem);
        if(head==null){
            head=newNode;
        }
        else{
            MyNode current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public T get(int index){
        MyNode current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return (T) current.data;
    }




}
