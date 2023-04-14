//sum using return function
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine; 
public class return1 {
    public static void main(String[] args) {
        
    
    int ans=sum();
    System.out.println(ans);
    }
static int sum(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum1 =a+b;
    return sum1;

} 

}