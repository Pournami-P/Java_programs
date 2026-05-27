import java.util.*;
public class rmdupli{
    public static void main(String[] args){
        List<String> list=Arrays.asList("A","B","C","A");
        LinkedHashSet<String> set=new LinkedHashSet<>(list);
        System.out.println(set);
    }
}

// import java.util.*;

// public class RmDupli {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         LinkedHashSet<String> set = new LinkedHashSet<>();

//         int n = sc.nextInt();

//         for(int i = 0; i < n; i++) {
//             set.add(sc.next());
//         }

//         System.out.println(set);
//     }
// }

// import java.util.*;

// public class RmDupli {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<String> list = new ArrayList<>();

//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             list.add(sc.next());
//         }

//         LinkedHashSet<String> set = new LinkedHashSet<>(list);

//         System.out.println(set);
//     }
// }