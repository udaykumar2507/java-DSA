//program to print the number of number(3) in the given number(124567)
public class problemloopscondition2 {
    public static void main(String[] args) {
        int a=1333334;
        int s=3;
        int count=0;
        while(a>0){
            if (a%10 ==s){
                count+=1;
            }
        a=a/10;

        }
    System.out.println("the count of num is"+count);
    //reverse a number
    int b=3456856;
    int count1=0;
    while(b>0){
        int rem=b%10;
        b /=10;
        count1=count1*10+rem;

    }

    }

    
}
