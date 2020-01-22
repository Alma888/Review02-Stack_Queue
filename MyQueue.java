import java.util.ArrayList;

//栈实现队列
public class MyQueue {
    private ArrayList<Integer> out;//出的栈（左边的）
    private ArrayList<Integer> in;//入的栈（右边的）
    public MyQueue(){
        out=new ArrayList<>();
        in=new ArrayList<>();
    }

    public void push(int x){
        in.add(x);//尾插
    }

    public int pop(){
        if(out.isEmpty()) {
           int size=in.size();
           for(int i=0;i<size;i++){
               int v=in.remove(in.size()-1);
               out.add(v);//将从in栈里出来的元素，再添加到out栈里去，实现顺序颠倒
           }
        }
        return out.remove(out.size()-1);
    }

    public int peek(){
        if(out.isEmpty()) {
            int size=in.size();
            for(int i=0;i<size;i++){
                int v=in.remove(in.size()-1);
                out.add(v);//将从in栈里出来的元素，再添加到out栈里去，实现顺序颠倒
            }
        }
        return out.get(out.size()-1);//返回最后一个元素即可
    }

    public boolean empty(){
        return out.isEmpty();
    }
}
