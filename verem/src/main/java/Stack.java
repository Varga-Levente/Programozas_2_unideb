import java.util.ArrayList;
import java.util.List;

public class Stack {
    public List<Integer> li;
    public int top;

    public Stack() {
        li = new ArrayList<>();
        top = -1;
    }

    public void push(int i){
        li.add(i);
        top++;
    }

    public int pop(){
        int i = li.get(top);
        li.remove(top);
        top--;
        return i;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public String toString(){
        //remove string last character
        String s = li.toString();
        return s.substring(0, s.length()-1) ;
    }

    public int size(){
        return top+1;
    }
}
