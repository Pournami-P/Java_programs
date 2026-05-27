import java.util.*;

public class square{
    public static void main(String[] args){
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            if(i==0||i==n-1){
                for(k=0;k<n;k++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(k=0;k<n-2;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}