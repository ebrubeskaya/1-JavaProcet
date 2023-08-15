package JavaLesson;

public class JavaMatrix {

    public static void main(String[] args) {


        int[][] a = {{1, 2, 5}, {1, 5, 3}, {3, 3, 3}};
        int[][] b = {{1, 5, 6}, {3, 2, 2}, {3, 1, 5}};

        int[][] c = new int[3][3];


        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                c[m][n] = 0;
                for (int l = 0; l < 3; l++) {
                    c[m][n] += a[m][l] * b[l][n];
                }

                System.out.print(c[m][n] + " ");
            }
            System.out.println();
        }
    }
}