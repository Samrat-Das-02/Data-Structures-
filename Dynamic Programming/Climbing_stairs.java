import java.util.*;
public class Climbing_stairs{
    public static int f(int index,int dp[])
    {
        if(index==0)
            return 1;
        if(index==1)
            return 1;
        if(dp[index]!=-1)
            return dp[index];
        return dp[index]=f(index-1, dp)+f(index-2,dp);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number of stairs :");
        Scanner s = new Scanner(System.in);
        int n;
        n=s.nextInt();
        int dp[]=new int[n+1];
        for(int i=0; i<n; i++)
         dp[i]=-1;
        System.out.println("The number of ways to climb the "+f(n-1,dp));
        s.close();
    }
}