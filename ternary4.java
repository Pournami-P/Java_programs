import java.util.*;
public class ternary4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int result=(a>b)?a:b;
        result=(result>c)?result:c;
        result=(result>d)?result:d;

        System.out.println(result);
    }
}