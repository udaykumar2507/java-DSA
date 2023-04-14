class leetcode2 {
    public int[] searchRange(int[] nums, int target) {
        int start=0;int end=nums.length-1;
        int[] res={-1,-1};
        while(start<=end){
            int mid=(start+end)/2;
            if (target==nums[mid]){
                res[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            } 
        }
        int start1=0;int end1=nums.length-1;
        while(start1<=end1){
            int mid1=(start1+end1)/2;
            if (target==nums[mid1]){
                res[1]=mid1;
                start1=mid1+1;
            }
            else if(nums[mid1]<target){
                start1=mid1+1;
            }
            else{
                end1=mid1-1;
            } 
        }
        return res;

        
    }
}