import java.util.*;
import java.lang.Math;
public class armstrong{
    public static void main(String[] args){
        int d,c=0,temp,n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0){
            d=n%10;
            c++;
            n=n/10;
        }
        n=temp;
        while(n>0){
            d=n%10;
            n=n/10;
            sum+=(int) Math.pow(d, c);
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }
    }
}