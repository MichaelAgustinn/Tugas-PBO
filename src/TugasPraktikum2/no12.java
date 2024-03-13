package TugasPraktikum2;

public class no12 {
    public static void main(String[] args) {

        double[][] arrayGrayscale = new double[4][4];

        int[] r = { 2, 7, 243, 28, 6, 8, 9, 68, 92, 126, 211, 255, 0, 4, 83, 38 };
        int[] g = { 8, 3, 254, 4, 1, 9, 21, 32, 92, 42, 12, 6, 5, 2, 7, 58 };
        int[] b = { 6, 5, 253, 3, 2, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };

        int[][][] arrayRGB = new int[4][4][3];

        int k = 0;
        for (int i = 0; i < arrayRGB.length; i++) {
            for (int j = 0; j < arrayRGB[i].length; j++) {
                arrayRGB[i][j][0] = r[k];
                arrayRGB[i][j][1] = g[k];
                arrayRGB[i][j][2] = b[k];
                arrayGrayscale[i][j] = Math.ceil((r[k] + g[k] + b[k]) / 3.0);
                k++;
            }
        }

        for (int i = 0; i < arrayGrayscale.length; i++) {
            for (int j = 0; j < arrayGrayscale[i].length; j++) {
                System.out.print(arrayGrayscale[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
