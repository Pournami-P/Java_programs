import java.util.*;
public class splitph{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n,rev=0,d,temp,c=0;
        n=sc.nextLong();
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        temp=rev;
        while(temp>0){
            c++;
            d=temp%10;
            System.out.print(d);
            if(c==3||c==6){
                System.out.print("-");
            }
            temp/=10;
        }
    }
}