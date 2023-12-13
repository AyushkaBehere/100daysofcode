// class Solution {
//     public int numSpecial(int[][] mat) {
//         int rows = mat.length;
//         int cols= mat[0].length;
//         int rowSum [] = new int [rows];
//         int colSum [] = new int [cols];

//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<cols; j++){
//                //adding rows
//                 rowSum [i] += mat [i][j];
//             }
//         }

//         for(int j = 0; j<cols; j++){
//             for(int i = 0; i<rows; i++){
//                //adding cols
//                 colSum [j] += mat [i][j];
//             }
//         }

//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<cols; j++){
//                 if( rowSum == 1 && colsum == 1 && mat[i][j] == 1)
//             }
//         }

        
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);     
//         int matrix [][] = new int [rows][cols];
//         System.out.println("No. of Rows =");
//          int rows = sc.nextInt();       
//         System.out.println("No. of Columns =");
//          int cols = sc.nextInt();
//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<cols; j++){
//                 System.out.println(matrix[i][j]);
//             }
//         }
//     }
// }





class Solution {
   
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols= mat[0].length;
        int rowSum [] = new int [rows];
        int colSum [] = new int [cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
               //adding rows
                rowSum [i] += mat [i][j];
            }
        }

        for(int j = 0; j<cols; j++){
            for(int i = 0; i<rows; i++){
               //adding cols
                colSum [j] += mat [i][j];
            }
        }
        int z=0;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if( rowSum[i] == 1 && colSum[j] == 1 && mat[i][j] == 1)
                {
                    z++;
                }
            }
        }
        return z;

        
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);     
        
        System.out.println("No. of Rows =");
         int rows = sc.nextInt();       
        System.out.println("No. of Columns =");
         int cols = sc.nextInt();
         int matrix [][] = new int [rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}