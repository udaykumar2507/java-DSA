//problem to find the max in a 2d array;
public class linearsearch4 {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                      {1,234,56},
                    {345,10008,587}};
        int c=max(arr);
        System.out.println(c);
    }
    static int max(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               if (arr[i][j]>max){
                max=arr[i][j];
               }
            }
         
        }
        return max;
    }

    
}
