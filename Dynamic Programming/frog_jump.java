//Input : 10 20 30 10
//output: 20
//import java.util.* ;
//import java.io.*; 
import java.lang.Math;
public class frog_jump {
    public static int f(int index,int []heights,int []dp){
        if(index==0)return 0;
        if(dp[index]!=-1)
            return dp[index];
        int left=Integer.MAX_VALUE;    
        int right=f(index-1, heights, dp)+Math.abs(heights[index]-heights[index-1]); 
        if(index>1)
            {
                 left =f(index-2, heights, dp)+Math.abs(heights[index]-heights[index-2]);
            }
        return dp[index]=Math.min(left, right);    
    }
    public static int frogJump(int n, int heights[]) {
        int dp[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
        return f(n-1, heights, dp);
        
    }
    public static void main(String[] args)
    {
        int heights[]={10,20,30,10};
        System.out.println("The output is: " +frogJump(4, heights));
    }
}
