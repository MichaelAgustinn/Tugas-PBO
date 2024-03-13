package pbo;

public class Test {
    public static void main(String[] args) {
        // Mendeklarasikan array 3D dengan ukuran tertentu
        // Mendeklarasikan array 3D dan langsung menginisialisasinya
        // int[][][] array3D = 
        // { // baris
        //         { // kolom
        //                 // channel
        //                 { 1, 2, 3 },
        //                 { 4, 5, 6 },
        //                 { 7, 8, 9 }
        //         },
        //         {
        //                 { 10, 11, 12 },
        //                 { 13, 14, 15 },
        //                 { 16, 17, 18 }
        //         },
        //         {
        //                 { 19, 20, 21 },
        //                 { 22, 23, 24 },
        //                 { 25, 26, 27 }
        //         }
        // };

        // // Menampilkan setiap nilai z dalam bentuk array
        // for (int[][] xyPlane : array3D) {
        //     System.out.println("Array Z:");
        //     for (int[] row : xyPlane) {
        //         for (int z : row) {
        //             System.out.print(z + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

                int[][][] array3D = new int[3][3][3]; // Membuat array 3D kosong dengan ukuran 3x3x3
        
                // Memasukkan data secara manual ke dalam array 3D
                array3D[0][0][0] = 1;
                array3D[0][0][1] = 2;
                array3D[0][0][2] = 3;
                array3D[0][1][0] = 4;
                array3D[0][1][1] = 5;
                array3D[0][1][2] = 6;
                array3D[0][2][0] = 7;
                array3D[0][2][1] = 8;
                array3D[0][2][2] = 9;

                array3D[1][0][0] = 1;
                array3D[1][0][1] = 2;
                array3D[1][0][2] = 3;
                array3D[1][1][0] = 4;
                array3D[0][1][1] = 5;
                array3D[0][1][2] = 6;
                array3D[0][2][0] = 7;
                array3D[0][2][1] = 8;
                array3D[0][2][2] = 9;
                // Lanjutkan untuk memasukkan data lainnya sesuai dengan kebutuhan
        
                // Menampilkan array 3D
                System.out.println("Array 3D:");
                for (int i = 0; i < array3D.length; i++) {
                    for (int j = 0; j < array3D[i].length; j++) {
                        for (int k = 0; k < array3D[i][j].length; k++) {
                            System.out.print(array3D[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
    }
}
