import java.util.*;
public class alphafinding{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        String res=((n>='A' && n<='Z')||(n>='a' && n<='z'))?"Alphabet":"Not alphabet";
        System.out.println(res);
    }
}