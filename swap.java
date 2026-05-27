import java.util.*;
public class swap{
    public static void main(String[] args){
        int a=2;
        int b=6;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}