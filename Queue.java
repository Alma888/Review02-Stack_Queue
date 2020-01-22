//单链表实现队列
class Node{
    int val;
    Node next;

    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
    Node(int val){
        this(0,null);
    }
}
public class Queue {
    private Node front = null; //链表的第一个结点
    private Node rear = null;  //链表的最后一个结点
    private int size = 0;      //队列中的所有元素个数

    //只有保证链表尾插头删   才符合队列的进出原则
    //尾插
    public void push(int val){
        Node node=new Node(val);
        if(front==null){
            front=node;
        }else {
            rear.next=node;
        }
        rear=node;
        size++;

    }
    //头删
    public void pop(){
        if(size<=0){
            System.out.println("队列为空！");
            return;
        }
        if(front!=null) {
            front = front.next;
            rear = null;
        }
        size--;
    }
    //返回队首元素
    public int front(){
        if(size<=0){
            System.out.println("队列为空！");
            return -1;
        }
        return front.val;
    }
    //返回队尾元素
    public int rear(){
        if(size<=0){
            System.out.println("队列为空！");
            return -1;
        }
        return rear.val;

    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }


}
