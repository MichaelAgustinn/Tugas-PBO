package TugasPraktikum3;

import java.util.HashSet;
import java.util.Scanner;

public class no4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> nimNim = new HashSet<>();
        while (true) {
            System.out.print("Masukkan Nim(ketik 'done' untuk berhenti) = ");
            String input = in.nextLine();
            if (input.equals("done")) {
                break;
            }
            nimNim.add(input);
        }
        int i = 1;
        for (String data : nimNim) {
            System.out.println("[" + i + "] " + data);
            i++;
        }
        in.close();
    }
}
