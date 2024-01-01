package Love_Babbar;

public class MoveNegELeBefore {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,-1,-99,54,67,5,4,-1000};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if (arr[left]>0 && arr[right]<0){
                swap(arr,left,right);
                left++;
                right--;
            }else if (arr[left]<0 && arr[right]>0){
                left++;
                right--;
            }else if (arr[left]<0 && arr[right]<0){
                left++;
            }else{
                right--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    
}
