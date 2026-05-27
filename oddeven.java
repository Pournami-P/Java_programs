import java.util.*;
public class oddeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=(n%2==0)?"Even":"Odd";
        System.out.println(res);
    }
}