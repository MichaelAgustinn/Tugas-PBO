package TugasPraktikum2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class pretest2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> baca = new ArrayList<String>();
            String pembacaan = "src/TugasPraktikum2/test.txt";
            File isi = new File(pembacaan);
            Scanner in = new Scanner(isi);
            while (in.hasNextLine()) {
                String pengisian = in.nextLine();
                baca.add(pengisian);
            }

            for (String b : baca) {
                System.out.println(b);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
