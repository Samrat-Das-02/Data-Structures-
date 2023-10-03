import java.util.*;
public class Longest_Subarray_with_sum_k {
    public static void Find_longest_Subarray(int[] nums,int k)
    {
        int n=nums.length;
        Map<Integer, Integer>map=new HashMap<Integer, Integer>();
        int sum=0;
        int maxlen=0;
        for(int i=0; i<n; i++)
        {
            sum+=nums[i];
            if(sum==k)
            {
                maxlen=Math.max(maxlen,i+1);
                System.out.println("["+0+"..."+i+"]");
            }
            int rem=sum-k;
            if(map.containsKey(rem))
            {
                int len=i-map.get(rem);
                maxlen=Math.max(maxlen, len);
                int left=map.get(rem)+1;
                System.out.println("["+left+"..."+i+"]");
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args)
    {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
 
        Find_longest_Subarray(nums,0);
    }
}
