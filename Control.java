import java.util.*;
public class Control{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=sc.nextInt();
        if(mark>=40 && mark<=49){
            System.out.println("Pass");
        }else if(mark>=50 && mark<=59){
            System.out.println("Second class");
        }else if(mark>=60 && mark<=69){
            System.out.println("First class");
        }else if(mark>=70 && mark<=100){
            System.out.println("Distinction");
        }else{
            System.out.println("Fail");
        }
    } 
}