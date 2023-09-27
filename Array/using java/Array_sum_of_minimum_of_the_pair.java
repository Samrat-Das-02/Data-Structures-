public class Array_sum_of_minimum_of_the_pair {
    
        public static int arrayPairSum(int[] nums,int n) {
            if(n%2!=0) return 0;
            if(n==2)return Math.min(nums[0], nums[1]);
            int i=0,j=1,sum=0,min_value;
            while(i<nums.length&&j<nums.length)
            {
                min_value = Math.min(nums[i], nums[j]);
                sum=sum+min_value;
                i+=2;j+=2;
            }
            return sum;
        }
        public static void main(String[] args)
        {
            int[] nums ={1,4,3,2,1,2,8,9};
            int sum=arrayPairSum(nums,nums.length);
            System.out.println(sum);
        }
    }

