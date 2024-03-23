package TugasPraktikum3;

public class no9 {
    public static void main(String[] args) {
        int[][] data = {
                { 0, 0, 0, 0, 0, 16, 0 },
                { 12, 0, 0, 3, 6, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 }
        };

        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(" " + data[i][j] + " ");

            }
            System.out.println("]");
        }
    }
}
