//swap two numbers
import java.util.Scanner;
public class swap1{
    public static void main(String[] args) {
        System.out.println("swap using temp");
        int a=10;
        int b=20;
        int temp=b;
        b=a;
        a=temp;
        System.out.println(a);
        System.out.println(b);
        //here the value doesnt changed
        System.out.println("swap using function value does,nt changed");
        int a1=10;
        int b1=20;
        swap(a1,b1);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("here also the value doesnt change");
        String name="kumbkaran";
        changename(name);
        System.out.println(name);

    }

//swap using function
static int swap(int a1,int b1){
     int temp=b1;
     b1=a1;
     a1=temp;
     return a1;

}
static void changename(String name){
    name="ujjval";
}
}
