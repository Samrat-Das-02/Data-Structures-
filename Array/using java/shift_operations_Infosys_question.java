import java.util.Scanner;

public class shift_operations {
    public static int[] shift_operation(int[] nums)
    {
        int n=nums.length;
        int sum=0;
        int[] sum_array=new int[n];
        for(int i:nums)
            sum+=i;   //
        System.out.println("Sum of all the elements in the array : "+sum);    
        for(int i=0;i<n;i++)    //for each operation
        {
            int[] nums1=new int[n];
            nums1[0]=Math.min(nums[0],nums[n-1]);
            for(int j=1;j<n;j++){
                int m=Math.min(nums[j],nums[j-1]);
                int gap=nums[j]-m;
                nums1[j]=m;
                sum-=gap;
            }
            sum_array[i]=sum;
            nums=nums1;
        }
        return sum_array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user to input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create an array of the specified size
        int[] array = new int[size];

        // Step 3: Iterate through the array and prompt the user to input each element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the input array
        System.out.println("Input array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] sum=shift_operation(array);
        System.out.println("Now the Array is :");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Sum array:");
        for (int num : sum) {
            System.out.print(num + " ");
        }
        // Close the scanner
        scanner.close();
    }
}
