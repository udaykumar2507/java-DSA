//floor of a number  given array (gretest number which is <=target element)
public class binarysearch4 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=4;
        int c=ceil(arr,target);
        System.out.println(c);
        
    }
    static int ceil(int[] arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (tar<arr[mid]){
                end=mid-1;
            }
            else if (tar>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }

        }
        return arr[end];

    }

    
}

