//problem to find the num of count of even number in a string
public class linearsearch5 {
    public static void main(String[] args) {
        int []arr={0,0,0};
        int c=findnum(arr);
        System.out.println(c);

    }
    static int findnum(int[] arr){
        int count=0;
        for(int num:arr){
             if (even(num)){
                count++;
             }
        }
        return count;
    }
    static boolean even(int num){
        int number=digits(num);
        if (number%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if (num<0){
            return num*-1;
        }
        if (num==0){
            return 1;
        }
        if (num>0){
            return num;

        }
        return num;  
       }
    }
    

