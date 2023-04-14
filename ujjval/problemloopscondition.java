// program to print the max between three number
import java.util.Scanner;
public class problemloopscondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the value is max in three integer");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
        int max=a;
        if(max<b){
            max=b;
        }if(max<c){
            max=c;
        }

     System.out.println("the max is " +max);
     Scanner input=new Scanner(System.in);
     System.out.println("input the given char to find whether it is lower or upper");
     char a1=input.next().strip().charAt(0);
     if(a1>='a' && a1<='z'){
        System.out.println("lowercasae");

     }else{
        System.out.println("uppercase");
     } 
    //program to print the fibonnaci series
    System.out.println("input the number for fibonacci series");
    int n=sc.nextInt();
    int a2=0;
    int b2=1;
    int count=2;
    while(count<=n){

        int temp=b2;
        b2=a2+b2;
        a2=temp;
        count++;

        

    } 
    System.out.println("the fibonacci series is"+b2);
    }
    
}

