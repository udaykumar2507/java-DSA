public class binarysearch5 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,9};
        int target=4;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return  binsearch(arr,target);
    }
    static int binsearch(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (tar>arr[mid]){
                start=mid+1;
            }else if( tar<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
   
}


    

