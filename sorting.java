import java.util.*;
public class sorting{
    public static void main(String[] args){
        int arr[]={4,7,2,3,9};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}

//proper bubble sort
// for(int i=0;i<arr.length-1;i++){
//     for(int j=0;j<arr.length-i-1;j++){
//         if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//     }
// }