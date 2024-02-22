import java.util.Arrays;
import java.util.Scanner;

public class Find_the_judge {
    public static int findJudge(int n, int[][] trust) {
        int row=trust.length;
        if(n==1)return 1;
        if(row==1)
            return trust[0][1];
        //int col=trust[0].length;
        int[] result=new int[n+1];
        Arrays.fill(result,0);
        for(int i=0;i<row;i++)
        {
            int tk=trust[i][0];
            int tu=trust[i][1];
            result[tk-1]-=1;
            result[tu-1]+=1;
        }
        int index=-1;
        for(int i=0;i<result.length;i++)
        {
            if(result[i]==(n-1))
                index=i+1;
        }
        return index;
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // // Input the number of persons
        // System.out.print("Enter the number of persons: ");
        // int numPersons = scanner.nextInt();
        // scanner.nextLine(); // Consume newline character
        
        // Input the 2D array
        // int[][] array = new int[numPersons][2];
        // System.out.println("Enter ai and bi (ai trusts the person labeled bi)");
        // for (int i = 0; i < numPersons; i++) {
            //     array[i][0] = scanner.nextInt(); // Input age
            //     array[i][1] = scanner.nextInt(); // Input height
            //     scanner.nextLine(); // Consume newline character
            // }
        int numPersons=3;    
        int[][] array ={{1,3},{2,3}};
        System.out.println("The judge in the town is " +findJudge(numPersons, array));
    }
}
