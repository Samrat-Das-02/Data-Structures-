import java.util.Arrays;

public class house_robber {
    
    public static int fun(int[] nums,int n,int[] dp)
    {
        if(n<=0) return 0;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=Math.max(fun(nums,n-1,dp),(nums[n-1]+fun(nums,n-2,dp)));
    }
    public static int rob(int[] nums) {
       int n = nums.length;
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);
        return fun(nums,n,dp);    
    
    }
    public static void main(String[] args)
    {
        int[] nums={2,1,1,2};
        int maxloot=rob(nums);
        System.out.println(maxloot);
    }    
}
