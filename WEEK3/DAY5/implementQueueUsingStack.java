package WEEK3.DAY5;
import java.util.Stack;

public class implementQueueUsingStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    
    public void MyQueue() {
        
    }
    
    public void push(int x) {
        if(st.size()==0) st.push(x);
        else{
            while(st.size()>0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size()> 0){
                st.push(helper.pop());
            }
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
    public static void main(String[] args) {
         implementQueueUsingStack q = new implementQueueUsingStack();

        q.push(1);
        q.push(2);

        System.out.println(q.peek());   
        System.out.println(q.pop());   
        System.out.println(q.empty());  
    }
}
