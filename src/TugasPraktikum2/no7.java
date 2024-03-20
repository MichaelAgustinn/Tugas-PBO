package TugasPraktikum2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class no7 {

    public ArrayList<MatKul> bacaData = new ArrayList<>();
    String namaFile = "src/TugasPraktikum2/data.csv";
    
    public void menu() {
        System.out.println("---------------------------------");
        System.out.println("Pilih Menu");
        System.out.println("[0] exit");
        System.out.println("[1] insert");
        System.out.println("[2] update");
        System.out.println("[3] delete");
        System.out.println("[4] print");
        System.out.println("[5] setFile");
        System.out.println("[6] reset");
        System.out.println("[7] open");
        System.out.println("[8] save to file");
        System.out.println("---------------------------------");
    }

    // menu insert area
    public boolean insert(String kode, String nama, int sks, String nilai) {
        boolean hasil = false;
        try {
            MatKul mk = new MatKul(kode, nama, sks, nilai);
            bacaData.add(mk);
            hasil = true;
        } catch (Exception e) {
            hasil = false;
        }
        return hasil;
    }
    // menu insert end

    // menu update area
    public boolean update(int index, String kode, String nama, int sks, String nilai) {
        boolean hasil = false;
        try {
            MatKul mk = new MatKul(kode, nama, sks, nilai);
            bacaData.set(index - 1, mk);
            hasil = true;
        } catch (Exception e) {
            hasil = false;
        }
        return hasil;
    }
    // menu update end

    // menu delete area
    public boolean remove(int index) {
        boolean hasil = false;
        try {
            bacaData.remove(index - 1);
            hasil = true;
        } catch (Exception e) {
            hasil = false;
        }
        return hasil;
    }
    // menu delete end

    // menu print area
    public String toString() {
        int nomor = 1;
        if (bacaData != null) {
            StringBuffer sb = new StringBuffer();
            sb.append("Kode MK | Matakuliah | SKS | Nilai\n");
            for (MatKul mk : bacaData) {
                sb.append("[" + nomor + "]  " + mk.kode + " | " + mk.nama + " | " + mk.sks + " | " + mk.nilai + "\n");
                nomor++;
            }
            return sb.toString();
        } else {
            return "[]";
        }
    }

    public void print() {
        System.out.println(toString());
        System.out.println();
    }
    // print notif

    public boolean print(int index) {
        if (bacaData != null && index >= 0 && index < bacaData.size()) {
            MatKul mk = bacaData.get(index);
            System.out.println(mk.kode + " | " + mk.nama + " | " + mk.sks + " | " + mk.nilai);
            return true;
        } else {
            System.out.println("Blum Ada Mata Kuliah Pada Index= " + index);
            return false;
        }
    }
    // menu print area end

    // menu setFile area
    public void setFile(String namaFile) {
        this.namaFile = namaFile;
    }
    // menu setfile end

    // menu open area
    public ArrayList<MatKul> open() {
        try {
            File isi = new File(namaFile);
            Scanner sc = new Scanner(isi);
            bacaData = new ArrayList<>();
            sc.nextLine(); // melangkai satu baris atau bagian header
            while (sc.hasNextLine()) { // selama dia mempunyai baris maka akan dicetak
                String baris = sc.nextLine();
                String[] kolom = baris.split(";");
                String kode = kolom[0];
                String nama = kolom[1];
                int sks = Integer.parseInt(kolom[2]);
                String nilai = kolom[3];
                MatKul mk = new MatKul(kode, nama, sks, nilai);
                bacaData.add(mk);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(no7.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bacaData;
    }
    // menu open end

    // menu save to file area
    public boolean saveToFile() {
        boolean hasil = false;
        try {
            FileWriter fw = new FileWriter(namaFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("Kode MK;Matakuliah;SKS;Nilai\n");
            for (MatKul mk : bacaData) {
                bw.append(mk.kode + ";" + mk.nama + ";" + mk.sks + ";" + mk.nilai + "\n");
            }
            bw.close();
            fw.close();
            hasil = true;
        } catch (Exception e) {
            hasil = false;
        }
        return hasil;
    }
    // menu save to file end

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        no7 n7 = new no7();

        boolean running = true;
        while (running) {
            n7.menu();
            System.out.print("Menu Yang Anda Pilih: ");
            int pilih = in.nextInt();

            switch (pilih) {
                case 0:
                    System.out.println("EXIT");
                    boolean status = n7.saveToFile();
                    running = false;
                    break;
                case 1:
                    System.out.println("INSERT");
                    System.out.print("Masukkan Kode Matkul     :  ");
                    in.nextLine();
                    String kode = in.nextLine();
                    System.out.print("Masukkan Nama Matkul    :  ");
                    String nama = in.nextLine();
                    System.out.print("Masukkan SKS Matkul      :  ");
                    int sks = in.nextInt();
                    System.out.print("Masukkan Nilai Matkul       :  ");
                    in.nextLine();
                    String nilai = in.nextLine();
                    status = n7.insert(kode, nama, sks, nilai);
                    if (status == true) {
                        System.out.println("Insert Data Is Successfully");
                    } else {
                        System.out.println("Insert Data was Failed");
                    }
                    break;
                case 2:
                    System.out.println("UPDATE");
                    System.out.print("Masukkan Index Matkul        :  ");
                    int index = in.nextInt();
                    in.nextLine();
                    System.out.print("Matkul Yang Akan D iUpdate  :  ");
                    status = n7.print(index - 1);
                    if (status == true) {
                        System.out.print("Masukkan Kode Matkul        :  ");
                        kode = in.nextLine();
                        System.out.print("Masukkan Nama Matkul       :  ");
                        nama = in.nextLine();
                        System.out.print("Masukkan SKS Matkul         :  ");
                        sks = in.nextInt();
                        in.nextLine();
                        System.out.print("Masukkan Nilai Matkul         :  ");
                        nilai = in.nextLine();
                        status = n7.update(index, kode, nama, sks, nilai);
                        if (status == true) {
                            System.out.println("Update Data Is Successfully");
                        } else {
                            System.out.println("Update Data was Failed");
                        }
                    }
                    break;
                case 3:
                    System.out.println("DELETE");
                    System.out.print("Masukkan Index Matkul        :  ");
                    index = in.nextInt();
                    in.nextLine();
                    System.out.print("Matkul Yang Akan Dihapus  :  ");
                    status = n7.print(index - 1);
                    if (status == true) {
                        System.out.println("Apakah Anda Yakin Akan Menghapus Data [Y] / [N]");
                        String confirm = in.nextLine();
                        if (confirm.equalsIgnoreCase("y")) {
                            status = n7.remove(index);
                            if (status == true) {
                                System.out.println("Delete Data Is Successfully");
                            } else {
                                System.out.println("Delete Data was Failed");
                            }
                        } else {
                            System.out.println("Penghapusan Data Dibatalkan");
                        }
                    }
                    break;
                case 4:
                    System.out.println("PRINT");
                    n7.print();
                    break;
                case 5:
                    System.out.println("setFile");
                    System.out.println("Masukkan Nama File Data: ");
                    in.nextLine();
                    String namaFile = in.nextLine();
                    n7.setFile(namaFile);
                    break;
                case 6:
                    System.out.println("RESET");
                    System.out.println("Apakah Anda Yakin Akan Mereset Data [Y] / [N]");
                    in.nextLine();
                    String confirm = in.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        n7.bacaData = new ArrayList<>();
                        System.out.println("Reset Data Is Successfully");
                    } else {
                        System.out.println("Reset Data is Cancelled");
                    }
                    break;
                case 7:
                    System.out.println("OPEN");
                    n7.open();
                    break;
                case 8:
                    System.out.println("SAVE TO FILE");
                    status = n7.saveToFile();
                    if (status) {
                        System.out.println("Data is successfully saved");
                    } else {
                        System.out.println("Data was not saved");
                    }
                    break;
                default:
                    System.out.println("PILIHAN TIDAK ADA DI MENU!!");
            }
        }
        in.close();
    }
}
