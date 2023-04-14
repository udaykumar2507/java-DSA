//sum using function
import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();
        greeting();
        
    }
    static void sum(){
        Scanner any=new Scanner(System.in);
        System.out.print("enter the num1:");
        int a=any.nextInt();
        System.out.print("enter the num2:");
        int b=any.nextInt();
        int sum=a+b;
        System.out.println("the sum is"+sum);
    }
    static void greeting(){
        System.out.println("hello world");
    }
    
}
