///take an array as input using func
// import java.util.Arrays;
// public class variablelengthargument{
//     public static void main(String[] args) {
//         func(1,2,3,4,45,6,7,8);

        
//     }
//     static void func(int...v){
//         System.out.println(Arrays.toString(v));
//     }
// }
import java.util.Arrays;
public class variablelengthargument{
    public static void main(String[] args) {
        mul(1,2,"kunal","kushwaha");

        
    }
    static void mul(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }
}