public class scopes {
    public static void main(String[] args) {
        int a=10;//here num can be accesed only inside the main function
        int b=20;
        System.out.println("");
        //we cannot change the value of a by this method(int a =50;)this will shows an error 
        //but we can change it by a=50;
        a=50;
        random(25);
        System.out.println(a);
        //block scope
        int a1=30;
        int b1=50;
        {
            int c=80;//here we cannot access c anywhere outside this block
        }
        //System.out.println(c); we cannot access outside so its shows an error

    }
    static void random(int marks){
        int num=67;//here num can be accesed only inside the function(local scope) 
        System.out.println(num);
        System.out.println("the marks is"+marks);
    } 
    
}
