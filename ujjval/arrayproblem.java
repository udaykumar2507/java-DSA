import javax.swing.text.PasswordView;


 import java.util.Arrays;
 public class arrayproblem {
     public static void main(String[] args) {
         int[]arr={12,35,67,34,78,56};
         swap(arr,0,4);
         System.out.println(Arrays.toString(arr));
         reverse(arr);
         System.out.println(Arrays.toString(arr));

        
     }
     static void swap(int[]arr,int index1,int index2){
         int temp=arr[index1];
         arr[index1]=arr[index2];
         arr[index2]=temp;

     }
     static void reverse(int[] arrr1){
        int start=0;
        int end=arrr1.length-1;
        while(start<end){
            swap(arrr1,start,end);
            start++;
            end--;
        }

        
    }

    }
// }
//Max in an array
// import java.util.Arrays;
// public class arrayproblem{
//     public static void main(String[] args) {
//         int[]arr={2,1000,7,95,99};
//         int c=max(arr);
//         System.out.println(c);

        
//     }
//     static int max(int [] arr){
//         int max1=arr[0];
//         for (int i=0;i<arr.length;i++){
//             if (max1<arr[i]){
//                 max1=arr[i];
//             }

//         }
//         return max1;

//     }
    



// }
// //program to revrese an array
