import java.util.*;
interface Animal{
    public abstract void eat();
    public void run();
}
public class interfacee implements Animal{
    @Override
    public void eat(){
        System.out.println("Eats only veg");
    }
    @Override
    public void run(){
        System.out.println("Runs fast");
    }
    public static void main(String[] args){
        interfacee i=new interfacee();
        i.eat();
        i.run();
    }
}