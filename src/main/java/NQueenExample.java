public class NQueenExample {

    public static boolean valid(int[][] mat, int i, int j) {
        int r, c, N;
        N = mat.length;
        r = i;
        c = j;
        //validate column
        while (r >= 0) {
            if (mat[r][c] == 1) {
                return false;
            }
            r--;
        }
        r = i;
        c = j;
        //validate left diagonal
        while ((r >= 0) && (c >= 0)) {
            if (mat[r][c] == 1) {
                return false;
            }
            r--;
            c--;
        }
        r = i;
        c = j;
        //validate right diagonal
        while ((r >= 0) && (c < N)) {
            if (mat[r][c] == 1) {
                return true;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = 0;
            }
        }
        NQueen(mat, 0, N);
    }

    private static void NQueen(int[][] mat, int i, int N) {
        //blocked state
        if (i == N) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (mat[r][c] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;//backtrack
        }
        //make choise at ith row
        for (int j = 0; j < N; j++) {
            // Place cell at [i,j] --> Valid and check
            if (valid(mat, i, j)) {
                mat[i][j] = 1;//placed queen
                NQueen(mat,i + 1, N);
                mat[i][j] = 0;//delete queen
            }
        }
    }
}
