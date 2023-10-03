import java.util.Scanner;

public class fibonacci_series {
    public static int fibo(int index, int dp[])
    {
        if(index==0)
            return 0;
        if(index==1)
            return 1;
        if(dp[index]!=-1)
            return dp[index];
        return dp[index]=fibo(index-1, dp)+fibo(index-2,dp);        
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number of fibonacci terms : ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int dp[]=new int[n+1];
        for(int i=0; i<n; i++)
            dp[i]=-1;
        System.out.println("The "+n+"th fibonacci term is : " +fibo(n-1,dp));
        scanner.close();
    }
}
