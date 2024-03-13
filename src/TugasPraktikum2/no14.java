package TugasPraktikum2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class no14 {
    ArrayList<String> bacaFile = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ArrayList<String> bacaData = new ArrayList<>();
            String namaFile = "src/TugasPraktikum2/test.txt";
            File isi = new File(namaFile);
            Scanner in = new Scanner(isi);

            while (in.hasNextLine()) {
                String baris = in.nextLine();
                bacaData.add(baris);
            }
            for (String b : bacaData) {
                System.out.println(b);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
