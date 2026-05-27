import java.util.*;

public class Stack {
    int st[] = new int[10];
    int top = -1;

    public void push(int a) {
        if(top == st.length - 1){
            System.out.println("Stack Overflow");
            return;
        }

        st[++top] = a;
    }

    public void pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }

        top--;
    }

    public void display() {
        for(int i = 0; i <= top; i++) {
            System.out.print(st[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(6);
        s.push(4);
        s.pop();
        s.push(10);
        s.push(7);
        s.push(8);
        s.pop();
        s.pop();
        s.push(1);

        s.display();
    }
}