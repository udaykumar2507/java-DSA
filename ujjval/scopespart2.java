public class scopespart2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            int c=90;
            System.out.println(c);
        }
        int c=100;
        System.out.println(c);//here the c is not same
        
    }
    
}
