package pbo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int tambah1 = 0;
        int tambah1_1 = 0;
        int k = 0;
        int hasil = 0;
        int[][] a = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        int[][] b = {
                { 9, 8, 7, 6 },
                { 5, 4, 3, 2 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int kali1 = a[0][0] * b[j][k];
                tambah1 = tambah1 + kali1;
                System.out.print(kali1 + " ");
            }
            System.out.println();
            k++;
        }

        

        // for (int i = 0; i < 1; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // int kali1_1 = a[0][0] * b[j][1];
        // tambah1_1 = tambah1_1 + kali1_1;
        // System.out.print(kali1_1 + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 1; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // int kali1_1 = a[0][0] * b[j][2];
        // tambah1_1 = tambah1_1 + kali1_1;
        // System.out.print(kali1_1 + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 1; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // int kali1_1 = a[0][0] * b[j][2];
        // tambah1_1 = tambah1_1 + kali1_1;
        // System.out.print(kali1_1 + " ");
        // }
        // System.out.println();
        // }

    }
}