//if we didnt know whwther the sorted array is ascneding order or descending 
public class binarysearch2{
    public static void main(String[] args) {
        int[]arr={999,777,666,555,44,33,22,10};
        int target=555 ;
        int c=bs(arr,target);
        System.out.println(c);
        
    }
    static int bs(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==tar){
                return mid;
            }
            if(isAsc){
                if(tar<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(tar<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

        }
    }
