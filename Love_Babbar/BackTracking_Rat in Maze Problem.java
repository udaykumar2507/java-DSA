class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int vis[][]=new int[n][n];
        ArrayList<String>list=new ArrayList<>();
        String move="";
        solve(0,0,m,vis,n,list,move);
        return list;
    }
      
            public static void solve(int i,int j,int [][]arr,int [][]vis,int n,ArrayList<String> ans,String move){
                if (i==n-1 && j==n-1){
                    ans.add(move);
                    return;
                }else{
                    //downward
                    if (i<n-1 && arr[i+1][j]==1 && vis[i+1][j]==0){
                        vis[i+1][j]=1;
                        solve(i+1,j,arr,vis,n,ans,move+"D");
                        vis[i+1][j]=0;
                    }
                    //Leftward
                     if (j>0 && arr[i][j-1]==1 && vis[i][j-1]==0){
                        vis[i][j-1]=1;
                        solve(i,j-1,arr,vis,n,ans,move+"L");
                        vis[i][j-1]=0;
                    }
                    //Rightward
                     if (j<n-1 && arr[i][j+1]==1 && vis[i][j+1]==0){
                        vis[i][j+1]=1;
                        solve(i,j+1,arr,vis,n,ans,move+"R");
                        vis[i][j+1]=0;
                    }
                    //Upward
                    if(i>0 && arr[i-1][j]==1 && vis[i-1][j]==0){
                        vis[i-1][j]=1;
                        solve(i-1,j,arr,vis,n,ans,move+"U");
                        vis[i-1][j]=0;
                    }
                }
            }
}
