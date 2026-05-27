import java.util.*;
public class markfail{
    public static void main(String[] args){
        int c=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n[]=new int[x];
        for(int i=0;i<x;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Entered marks are:");
        for(int m:n){
            System.out.println(m);
            if(m<40){
                c++;
            }
        }
        System.out.println("Number of subjects failed:"+c);
    }
}