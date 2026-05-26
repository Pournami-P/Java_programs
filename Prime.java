import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
    }
}
//import java.lang.Math;
//Math.sqrt(n);