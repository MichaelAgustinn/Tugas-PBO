package TugasPraktikum2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        try {
            ArrayList<MatKul> bacaData = new ArrayList<>();
            String namaFile = "src/TugasPraktikum2/data.csv";
            File isi = new File(namaFile);
            Scanner in = new Scanner(isi);



            System.out.println("Kode MK | Matakuliah | SKS | Nilai");
            // untuk melangkahi 1 baris
            in.nextLine();
            while (in.hasNextLine()) {
                String baris = in.nextLine();
                String[] kolom = baris.split(";");
                String kode = kolom[0];
                String nama = kolom[1];
                int sks = Integer.parseInt(kolom[2]);
                String nilai = kolom[3];
                MatKul mk = new MatKul(kode, nama, sks, nilai);
                bacaData.add(mk);
                System.out.println(mk.kode + " | " + mk.nama + " | " + mk.sks + " | " + mk.nilai);
            }
            in.close();
            System.out.println(bacaData);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}