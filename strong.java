import java.util.*;
public class strong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,temp,fact=1,sfact=0,d,i;
        n=sc.nextInt();
        temp=n;
        while(n>0){
            d=n%10;
            fact=1;
            for(i=1;i<=d;i++){
                fact*=i;
            }
            sfact+=fact;
            n=n/10;
        }
        if(sfact==temp){
            System.out.println("Strong number");
        }else{
            System.out.println("Not");
        }
    }
}