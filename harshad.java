//Also called niven number
import java.util.*;
public class harshad{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,temp,d,sum=0;
        n=sc.nextInt();
        temp=n;
        while(n>0){
            d=n%10;
            sum+=d;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not");
        }
    }
}