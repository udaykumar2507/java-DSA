//program to find the target element in the sorted element in ascending order 
//  public class binarysearch1 {
//      public static void main(String[] args) {
//          int[]arr={1,2,3,4,5,6,7,89};
//          int target=89;
//          int c=binsearch(arr,target);
//          System.out.println(c);


//      }
//      static int binsearch(int[]arr,int tar){
//          int start=0;
//          int end=arr.length-1;
//          while(start<=end){
//              int mid=(start+end)/2;
//              if (tar>arr[mid]){
//                  start=mid+1;
//              }else if( tar<arr[mid]){
//                  end=mid-1;
//              }
//              else{
//                  return mid;
//              }
//          }
//          return -1;
//      }
    
//  }
public class binarysearch1 {// for descending order sorted array
    public static void main(String[] args) {
        int[]arr={5666,4555,3444,2222,1444,989};
        int target=3444;
        int c=binsearch(arr,target);
        System.out.println(c);


    }
    static int binsearch(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (tar<arr[mid]){
                start=mid+1;
            }else if( tar>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
   
}

