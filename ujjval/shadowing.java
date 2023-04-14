// 
// public class shadowing {

//      static int x=90;
//      public static void main(String[] args) {
//         System.out.println(x);
//          fun();
//      }
//      static void fun(){
//          System.out.println(x);
//      }
    
//  }this prints output 90
//                      90
public class shadowing {

    static int x=90;
    public static void main(String[] args) {
       System.out.println(x);
       int x=40;//it gives the shadow of x=90 to 40
       System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);//in fun( it takes the value x which is in the above class not the shadowed x)
    }
   
}