package TugasPraktikum3;

import java.util.HashMap;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        HashMap<String, String> dataMhs = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Nim (ketik 'done' untuk berhenti): ");
            String key = in.nextLine();
            if (key.equals("done"))
                break;
            System.out.print("Masukkan Nama: ");
            String value = in.nextLine();
            dataMhs.put(key, value);
        }
        for (String nim : dataMhs.keySet()) {
            String nama = dataMhs.get(nim);
            System.out.println("Nim: " + nim + ", Nama: " + nama);
        }
        in.close();
    }
}
