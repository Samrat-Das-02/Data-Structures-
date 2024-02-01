// 2966. Divide Array Into Arrays With Max Difference

// You are given an integer array nums of size n and a positive integer k.

// Divide the array into one or more arrays of size 3 satisfying the following conditions:
// Each element of nums should be in exactly one array.
// The difference between any two elements in one array is less than or equal to k.
// Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions,
// return an empty array. And if there are multiple answers, return any of them.

//  Example 1:

// Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
// Output: [[1,1,3],[3,4,5],[7,8,9]]
// Explanation: We can divide the array into the following arrays: [1,1,3], [3,4,5] and [7,8,9].
// The difference between any two elements in each array is less than or equal to 2.
// Note that the order of elements is not important.
// Example 2:

// Input: nums = [1,3,3,2,7,3], k = 3
// Output: []
// Explanation: It is not possible to divide the array satisfying all the conditions.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Divide_Array_Into_Arrays_With_Max_Difference {
    public static int[][] divideArray(int[] nums, int k) {
        int n =nums.length;
        int row=nums.length/3,col=3;
        int[][] ans=new int[row][col];
        //int[][] ans1;
        Arrays.sort(nums);
        int index=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ans[i][j]=nums[index++];
                //index++;
            }
        }
        for(int i=0;i<row;i++)
        {
            if(Math.abs(ans[i][0]-ans[i][1])<=k&&Math.abs(ans[i][1]-ans[i][2])<=k&&Math.abs(ans[i][0]-ans[i][2])<=k)
                continue;
            else
            {
                return new int[0][];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the value k : ");
        int k=sc.nextInt(); 
        int[][] ans=divideArray(arr,k);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }        
        
    }
}
