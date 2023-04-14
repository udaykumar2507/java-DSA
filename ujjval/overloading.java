// public class overloading {
//     public static void main(String[] args) {
//         System.out.println("kunal");
        
//     }
//     static void fun(int a){//here it takes two function of same name and works according 
//         System.out.println(a);//to their datatyoe which it return
//     }
//     static void fun(String a){
//         System.out.println(a);

//     }
// }
//another example
// 
// public class overloading{
//     public static void main(String[] args) {
//         int ans=sum(1,6);
//         System.out.println(ans);
//     }
//     static int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     static int sum(int a,int b){
//         return a+b;
//     }
// }
import java.util.Arrays;
public class overloading{
    public static void main(String[] args) {
        demo("aravind ","kumar","maurya");
    }
    static void demo(int...v){
        System.out.println("first one");
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println("second one");
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a,int b){
        return a+b;
    }
}