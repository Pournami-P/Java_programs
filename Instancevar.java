public class Instancevar{
    int amount=2000;

    public static void main(String[] args){
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.amount+=5000;
        System.out.println("First objext "+b1.amount);
        System.out.println("First objext "+b2.amount);
        //if static int amount is declared and if we change in one object,it gets globally changed
        //whereas it is opposite for instance 
    }
}
/*
public class Calc{
    static void add(int x,int y){
        int z=x+y;
        System.out.println("The addition of "+x+" and "+y+" is "+(z));
    } 
    static int cube(int x){
        return(x*x*x);
    }
    public static void main(){
        Calc.add(2,3);
        int result=Calc.cube(4);
        Sop(result);
    }
}
 */