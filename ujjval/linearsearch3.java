//program to find the index of an element in a 2d array
import java.util.Arrays;
public class linearsearch3 {

    public static void main(String[] args) {
        int[][]arr={{1,2,3,5,6,7,89,69},
                    {12,34,34,56},
                    {1,21},
                    {1,23,45}};
                    int target=21;
                    int[] ans=search2d(arr, target);
                    System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};

    }
    
}
