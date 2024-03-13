package pbo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Pbo {

    ArrayList<MatKul> transkrip = new ArrayList<>();
    String namaFile = "src/pbo/data.csv"; 

// menu open
public ArrayList<MatKul> open(){
    File bacaFile = new File("src/pbo/data.csv");
    return null;
}
// menu open end

    public static void main(String[] args) {
                int[][][] arrayRGB = new int[4][4][3];


        
                arrayRGB[0][0] = new int[]{2, 8, 6};
                arrayRGB[0][1] = new int[]{7, 3, 5};
                arrayRGB[0][2] = new int[]{243, 254, 253};
                arrayRGB[0][3] = new int[]{28, 4, 3};
        
                arrayRGB[1][0] = new int[]{6, 1, 2};
                arrayRGB[1][1] = new int[]{8, 9, 1};
                arrayRGB[1][2] = new int[]{9, 21, 3};
                arrayRGB[1][3] = new int[]{68, 32, 5};
        
                arrayRGB[2][0] = new int[]{92, 92, 7};
                arrayRGB[2][1] = new int[]{126, 42, 9};
                arrayRGB[2][2] = new int[]{211, 12, 11};
                arrayRGB[2][3] = new int[]{255, 6, 13};
        
                arrayRGB[3][0] = new int[]{0, 5, 15};
                arrayRGB[3][1] = new int[]{4, 2, 17};
                arrayRGB[3][2] = new int[]{83, 7, 19};
                arrayRGB[3][3] = new int[]{38, 58, 21};
        // System.out.println(Arrays.deepToString(arrayRGB));
                // Menampilkan data dari array 3D
                System.out.println("Array 3D: [baris][kolom][channel]");
                for (int row = 0; row < 4; row++) {
                    for (int col = 0; col < 4; col++) {
                        System.out.println(Arrays.toString(arrayRGB[row][col]) );
                        // for (int channel = 0; channel < 3; channel++) {
                        //     System.out.print(arrayRGB[row][col][channel] + " ");
                        // }
                        // System.out.print("\t");
                    }
                    System.out.println();
                }
           
        
    }
    
}
