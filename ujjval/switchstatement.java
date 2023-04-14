import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args) {
        System.out.println("enter the fruit apple or mango");
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }
        if(fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }
    //this is not visible very well so we use switch
    System.out.println("by  using switch");
    Scanner input=new Scanner(System.in);
    String fruit1=input.next();
    switch(fruit1){
        case "mango":
            System.out.println("king of fruit");
            break;
        case "apple":
            System.out.println("a sweet red fruit");
            break;
        case "orange":
            System.out.println("round fruit");
            break;
        case "grapes":
            System.out.println("small fruit");
            break;
        default:
            System.out.println("enter a valid fruit");
                      
               
    }
    //program to print the whether the day is weekend or week day
    String day=sc.next();
    switch(day){
        case "monday":
            System.out.println("weekday");
            break;
        case "tuesday":
            System.out.println("weekday");
            break;
        case "wednesday":
            System.out.println("weekday");
            break;
        case "thursday":
            System.out.println("weekday");
            break;
        case "friday":
            System.out.println("weekday");
            break;
        case "saturday":
            System.out.println("weekdend");
            break;
        case "sunday":
            System.out.println("weekend");
           
    }
    }

    
}
