package pbo;

import java.util.HashMap;
import java.util.Scanner;

public class Pbo {
    public static void main(String[] args) {
        HashMap<String, String> dataMhs = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Nim: ");
            String key = in.nextLine();
            if (key.equals("done"))
                break;
            System.out.print("Masukkan Nama: ");
            String value = in.nextLine();
            dataMhs.put(key, value);
        }
        
    }
}
