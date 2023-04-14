//richest customer wealth;
/*
 * [1,2,3]=1+2+3=6
 * [9,1,6]=9+1+6=16
 * [3,3,7]=3+3+7=13
 */
public class leetcode1 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{10,20,40}};
        int ans=Integer.MIN_VALUE;
        int c=rich(arr,ans);
        System.out.println(c);
    }
    static int rich(int[][]arr,int ans){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if (ans<sum)
            {
                ans=sum;
            }
        }
        return ans;
    }
    



    }
