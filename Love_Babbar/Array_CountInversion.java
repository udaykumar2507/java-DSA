class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array
     static long inversionCount(long arr[], long N)
    {
    int c=0;
    for(int i=0;i<N;i++){
        long m=find(arr,i,arr[i]);
        c+=m;
    }
    return c;
    }
    static long find(long arr[],int ind,long val){
        long cnt=0;
        for (int j=ind+1;j<arr.length;j++){
            if (arr[j]<val){
                cnt++;
            }
        }
        return cnt;
    }
}
