public class minimum_time_to_visit_all_points {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
         for(int i=1;i<points.length;i++)
         {
             ans=ans+Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
         }
         return ans;
     }
    public static void main(String[] args)
    {
        int[][] points=new int[3][3];
        points[0][0]=1;points[0][1]=1;
        points[1][0]=3;points[1][1]=4;
        points[2][0]=-1;points[2][1]=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(points[i][j]+ "    ");
            }
            System.out.println();
        }
        System.out.println("Minimum time to visit all points : "+minTimeToVisitAllPoints(points)); 
    }
}
