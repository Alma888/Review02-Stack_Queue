//队列实现栈：
// 栈：前进后出
// 队列：前进先出

import java.util.LinkedList;

public class MyStack {
    private LinkedList<Integer> queue;  //链表实现存储


    /** Initialize your data structure here. */
    public MyStack(){
        queue=new LinkedList<>();
    }
    /** Push element x onto stack. */
    public void push(int x){
        queue.addLast(x);
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop(){
        for(int i=0;i<queue.size()-1;i++){
            int v=queue.pollFirst();
            queue.addLast(v);
        }
        return queue.pollFirst();

    }
    /** Get the top element. */
    public int top(){
        for(int i=0;i<queue.size()-1;i++){
            int v=queue.pollFirst();
            queue.addLast(v);
        }
        int q= queue.pollFirst();
        queue.addLast(q);
        return q;
    }
    /** Returns whether the stack is empty. */
    public boolean empty(){
        return queue.isEmpty();
    }
}
