//  import java.util.Scanner;
//  import java.util.Arrays;
//  import javax.sound.sampled.SourceDataLine;
//  public class array2d {
//      public static void main(String[] args) {
//          Scanner in=new Scanner(System.in);
//          int [][] arr=new int[3][3];
//          System.out.println(arr.length);
//          for (int i=0;i<arr.length;i++){
//              for(int j=0;j<arr[i].length;j++){
//                  arr[i][j]=in.nextInt();

//              }
//              System.out.println();
//          }
//          for (int i=0;i<arr.length;i++){
//              for(int j=0;j<arr[i].length;j++){

//                  System.out.println(arr[i][j]+" ");
//                 }
//                 System.out.println();
//              }
//      }   
    
    
//  }
// 
import java.util.Scanner;
import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;
public class array2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();

            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

        }
    }
