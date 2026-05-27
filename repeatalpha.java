// import java.util.*;
// public class  repeatalpha{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='e'){
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
// }

import java.util.*;
public class  repeatalpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(charAt(i)==charAt(j)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}



// import java.util.*;

// public class RepeatAlpha {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();

//         for (int i = 0; i < s.length(); i++) {

//             int count = 1;

//             // Skip if already counted
//             boolean visited = false;

//             for (int k = 0; k < i; k++) {
//                 if (s.charAt(i) == s.charAt(k)) {
//                     visited = true;
//                     break;
//                 }
//             }

//             if (visited)
//                 continue;

//             for (int j = i + 1; j < s.length(); j++) {
//                 if (s.charAt(i) == s.charAt(j)) {
//                     count++;
//                 }
//             }

//             System.out.println(s.charAt(i) + " = " + count);
//         }
//     }
// }