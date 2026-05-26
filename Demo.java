import java.util.*;
public class Demo{
    public static void main(String[] args){
        int ec=0,oc=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        System.out.println("Even:"+ec);
        System.out.println("Even:"+oc);
    }
}

/*for(int i=2;i<=10;i+=2){
    ec++;
} */