import javax.swing.text.PasswordView;

public class ascii {
    public static void main(String[] args) {
        int num='a';
        System.out.println(num); // it contains  ascii value
        // java works on unicode
        String c="हाय आई आई";
        System.out.println(c);
        float num1=554.78f;
        int num2=6;
        System.out.println(num1*num2);//output must be in float beacuse float have large storage than int
        System.out.println(num2*num2);//int*int=int
        //an example to clear  all the concept
        byte a2=42;
        char b2='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.12345;
        System.out.println((f+a2)+" "+(i/b2)+" "+(d*s));
        System.out.println((f*a2)+(i/b2)-(d*s));//total answer  is stored in double
        


        

    }
    
}
