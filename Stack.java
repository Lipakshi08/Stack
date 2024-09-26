package Stack;
import java.util.ArrayList;

public class Stack {
    static class StackClass{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        StackClass s = new StackClass();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
