import java.util.*;
import java.lang.Math;
public class disarium{
    public static void main(String[] args){
        int n,temp,d,c=0,rev=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        while(rev>0){
            d=rev%10;
            c++;
            sum=sum+(int)Math.pow(d,c);
            rev=rev/10;
        }
        if(sum==temp){
            System.out.println("Disarium number");
        }else{
            System.out.println("Not");
        }
    }
}