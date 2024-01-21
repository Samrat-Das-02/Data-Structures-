import java.util.*;
public class pascals_triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++) {
        List<Integer> row= new ArrayList<>();
        for(int j=0;j<=i;j++) {
            if(j==0||j==i)
                row.add(1);
            else
            {
                int num;
                num=result.get(i-1).get(j)+result.get(i-1).get(j-1);
                row.add(num);
            }    
        }
        result.add(row);
    }
    
        return result;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to generate the Pascals triangles");
        int n=scanner.nextInt();
        List<List<Integer>> triangles = new ArrayList<List<Integer>>();
        triangles=generate(n);
        System.out.println(triangles);
        scanner.close();
    }
}
