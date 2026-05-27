import java.util.*;
public class adam{
    public static void main(String[] args){
        int n,sq,d,rev=0,sqnew;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        System.out.println("sq:"+sq);
        System.out.println("n:"+n);
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("rev:"+rev);
        sqnew=rev*rev;
        System.out.println("sqnew:"+sqnew);
        rev=0;
        while(sqnew>0){
            d=sqnew%10;
            rev=rev*10+d;
            sqnew/=10;
        }
        System.out.println("rev:"+rev);
        if(sq==rev){
            System.out.println("Adam number");
        }else{
            System.out.println("Not Adam number");
        }
    }
}