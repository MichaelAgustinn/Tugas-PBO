package TugasPraktikum3;

import java.util.Scanner;
import java.util.Stack;

public class no3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> test = new Stack<>();
        System.out.print("Masukkan Inputan: ");
        String input = in.nextLine();
        String kebalikan = "";
        for (int i = 0; i < input.length(); i++) {
            test.push(input.charAt(i));
        }

        int leng = test.size();
        for (int i = 0; i < leng; i++) {
            kebalikan += test.pop();
        }

        System.out.println(kebalikan);
        in.close();
    }
}
