import java.util.*;
public class alphnosp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char cc=sc.next().charAt(0);
        if((cc>='a' && cc<='z')||cc>='A' && cc<='Z'){
            System.out.println("This is an alphabet");
        }else if(cc>='0' && cc<='9'){
            System.out.println("This is a number");
        }else{
            System.out.println("This is a special symbol");
        }
    }
}