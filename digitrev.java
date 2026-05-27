import java.util.*;
public class digitrev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d,n,c=0,sum=0,pro=1,sfact=0,fact=1,i,rev=0,ec=0,oc=0;
        n=sc.nextInt();
        while(n>0){
            d=n%10;
            c++;
            rev=rev*10+d;
            n=n/10;
            sum+=d;
            pro*=d;
            fact=1;
            for(i=1;i<=d;i++){
                fact*=i;
            }
            sfact+=fact;
            if(d%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        System.out.println();
        System.out.println("Count:"+c);
        System.out.println("Sum:"+sum);
        System.out.println("Product:"+pro);
        System.out.println("Sum of Factorial:"+sfact);
        System.out.println("Reverse:"+rev);
        System.out.println("Odd:"+oc);
        System.out.println("Even:"+ec);
    }
}