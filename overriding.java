import java.util.*;
class Tiger{
    int legs=4;
    void eat(){
        System.out.println("Eats veg and non veg");
    }
}
public class overriding extends Tiger{
    void eat(){
        super.eat();
        System.out.println("Runs fast");
    }
    public static void main(String[] args){
        singlein s=new singlein();
        s.eat();
        System.out.println("Tiger has "+s.legs+" legs");
    }
}