//int [] roll no={34,89,09,87,78} syntax for  arrays
// import java.util.Arrays;
// public class arrays{
//     public static void main(String[] args) {
//         int[] rollno={23,4,5,6788,5554};
//         System.out.println(Arrays.toString(rollno));
//     }

// }
// import java.util.Scanner;
// import java.util.Arrays;
// public class arrays{
//     public static void main(String[] args) {
//         int[] arr=new int[5];
//         Scanner sc=new Scanner(System.in);
//         for (int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             System.out.print(arr[i]+" ");
//         }
//         int[] u={23,45,6,78,87};
//         for (int num:u){
//             System.out.println(num);
//         }

//     }
// }
import java.util.Scanner;
import java.util.Arrays;
public class arrays{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}