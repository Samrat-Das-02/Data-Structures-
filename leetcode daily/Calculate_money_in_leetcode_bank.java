import java.util.*;
public class Calculate_money_in_leetcode_bank
{
    public static int totalMoney(int n) {
        int x=n/7;
        int i=7*x;
        int r=(n-i);
        return x+1+r;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int n;
        n=sc.nextInt();
        System.out.println("Total amount : "+totalMoney(n));
        sc.close();
    }
}