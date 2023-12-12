// Given the array of integers nums, you will choose two different indices i and j of that array. 
// Return the maximum value of (nums[i]-1)*(nums[j]-1).
import java.util.Arrays;
import java.util.Scanner;

public class Maximum_product_of_2elements {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-2,j=nums.length-1;
        return (nums[i]-1)*(nums[j]-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        } 
        System.out.println("The Maximum product of 2 elements in the array : "+maxProduct(arr));      
    } 
}
