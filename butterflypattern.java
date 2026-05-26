import java.util.*;
public class butterflypattern{
    public static void main(String[] args){
        int i,j,space,star=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        space=2*n-1;
        for(i=1;i<=2*n-1;i++){
            if(i<=n){
                space-=2;
                star++;
            }else{
                space+=2;
                star--;
            }
            for(j=1;j<=star;j++){
                System.out.print("*");
            }
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1;j<=star;j++){
                if(j!=n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}