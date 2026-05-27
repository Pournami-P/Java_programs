import java.util.*;
public class greedy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] coins={100,50,20,10,5,2,1};
        System.out.println("Enter amount:");
        int amount=sc.nextInt();
        System.out.println("Coins used:");

        //greedy approach
        for(int i=0;i<coins.length;i++){
            while(amount>=coins[i]){
                amount=amount-coins[i];
                System.out.println(coins[i]);
            }
        }
    }
}