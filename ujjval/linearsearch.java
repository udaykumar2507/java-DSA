//problem to find the index of an element in an  array
public class linearsearch {
    public static void main(String[] args) {
        int[] arr={2,34,554,223,567};
        int target=567;
        int c=lsearch(arr,target);
        System.out.println(c);
        
    }
    static int lsearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    
}
