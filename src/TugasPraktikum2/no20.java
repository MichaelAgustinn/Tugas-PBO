package TugasPraktikum2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class no20 {

    public static int random(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int individu[] = new int[n];

        for (int j = 0; j < n; j++) {
            int rand = random(1, n);
            boolean sama = true;
            while (sama) {

                sama = false;
                for (int i = 0; i < j; i++) {
                    if (rand == individu[i]) {
                        sama = true;
                        rand = random(1, n);
                        break;
                    }
                }
            }
            individu[j] = rand;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(individu[i] + " ");
        }
        in.close();
    }
}

class vector {

    public static int random(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Vector<Integer> individu = new Vector<>();

        for (int j = 0; j < n; j++) {
            int rand = random(1, n);
            while (individu.contains(rand)) {
                rand = random(1, n);
            }
            individu.add(rand);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(individu.get(i) + " ");
        }
        in.close();
    }

}

class Arrayl {

    public static int random(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> individu = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            int rand = random(1, n);
            while (individu.contains(rand)) {
                rand = random(1, n);
            }
            individu.add(rand);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(individu.get(i) + " ");
        }
        in.close();
    }

}

class linked {

    public static int random(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> individu = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            int rand = random(1, n);
            while (individu.contains(rand)) {
                rand = random(1, n);
            }
            individu.add(rand);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(individu.get(i) + " ");
        }
        in.close();
    }

}
