//progrm to check whether the character in a string
public class linearsearch2 {
    public static void main(String[] args) {
        String name="ujjval";
        char target='p';
        boolean c=serach(name,target);
        System.out.println(c);

    }
    static boolean serach(String name,char tar){
        if (name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(tar==name.charAt(i)){
                return true;
            }

        }
    return false;
    }

    
}
