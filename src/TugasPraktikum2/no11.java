package TugasPraktikum2;

public class no11 {
    public static void main(String[] args) {
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
                k++;
            }
        }

        int label = 0;
        char channel[] = { 'R', 'G', 'B' };
        for (k = 0; k < 3; k++) {
            System.out.println("Channel-" + channel[k]);
            for (int i = 0; i < arrayRGB.length; i++) {
                for (int j = 0; j < arrayRGB[i].length; j++) {
                    System.out.print(arrayRGB[i][j][label] + "\t");

                }
                System.out.println();
            }
            System.out.println();
            label++;
        }
    }
}
