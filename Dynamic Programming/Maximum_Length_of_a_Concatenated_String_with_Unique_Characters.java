
import java.util.*;
public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {
    public static boolean hasduplicates(String s1,String s2)
    {
        int[] al=new int[26];
        Arrays.fill(al,0);
        for(char ch:s1.toCharArray())
        {
            if(al[ch-'a']>0) return true;
            al[ch-'a']++;
        }
        for(char ch : s2.toCharArray())
        {
            if(al[ch-'a']>0)return true;
            al[ch-'a']++;
        }
        return false;
    }
    public static int solve(int index,String temp,List<String> arr,int n)
    {
        if(index>=n)return temp.length();
        int include=0,exclude=0;
        if(hasduplicates(arr.get(index),temp))
            exclude=solve(index+1,temp,arr,n);
        else
        {
            include=solve(index+1,temp+arr.get(index),arr,n);
            exclude=solve(index+1,temp,arr,n);
        }    
        return Math.max(include,exclude);
    }
    public static int maxLength(List<String> arr) {
        int n=arr.size();
        String temp="";
        int index=0;
        return solve(index,temp,arr,n);
    }
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings :");
        int n=scanner.nextInt();
        System.out.println("Enter the strings : ");
        for(int i=0; i<=n; i++)
        {
            String in=scanner.nextLine();
            l.add(in);
        }
        System.out.println("The maximum length of the concatenated string with unique characters is :"+maxLength(l));
        scanner.close();
    }
}
