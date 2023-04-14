import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter employee id");
        int empId=in.nextInt();
        System.out.println("enter the department");
        String department=in.next();
        switch(empId){
            case 1:
                System.out.println("ujjval");
            break;
            case 2:
                System.out.println("uday");
            break;
            case 3:
                switch(department){
                case "IT":
                    System.out.println("IT department");
                break;
                case "management":
                    System.out.println("management department");
                break;
                default:
                    System.out.println("no department entered");
            }
            break;
            default:
                System.out.println("enter correct empId");    
        
        }
        

    }
    
}
