public class FindMaxPathTriangle {

    public static void main(String[] args) {

        /*{3,0,0,0},
        {7, 4,0,0},
        {2, 4, 6,0},
        {8, 5, 9, 3}
        */
        int[][] triangle ={
                {3,0,0,0},
                {7, 4,0,0},
                {2, 4, 6,0},
                {8, 5, 9, 3}
        };
        
        int  maxPath= findMaxPath(triangle);
        System.out.println("Maximum path is :"+maxPath);
    }

    private static int findMaxPath(int[][] triangle) {

        for(int i=triangle.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                triangle[i][j]+=Math.max(triangle[i+1][j],triangle[i+1][j+1]);
            }
        }
        return triangle[0][0];
    }
}
