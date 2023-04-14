// creating a simple calculator 
import java.net.SocketTimeoutException;
import java .util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        char operator=sc.next().trim().charAt(0);
        if(operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%'){
            System.out.println("enter the two num");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(operator=='+'){
                System.out.println(a+b);
            }
            if(operator=='-'){
                System.out.println(a-b);
            }
            if (operator=='*'){
                System.out.println(a*b);
            }
            if(operator=='/'){
                if(b!=0){
                    System.out.println(a/b);
                }
            }
            if (operator=='%'){
                System.out.println(a%b);
            }    
        
        
            
        }else{
            System.out.println("invalid operator");

        }
    }
        }

    

