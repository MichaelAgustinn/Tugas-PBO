package pbo;

import java.util.Stack;

public class Pbo {
    public static void main(String[] args) {
        Stack<Integer> data = new Stack<>();

        System.out.println(data.empty());
        for (int i = 1; i <= 5; i++) {
            data.push(i);
        }
        System.out.println(data.empty());
        System.out.println(data);
        System.out.println(data.pop());
        System.out.println(data);
        System.out.println(data.peek());
    }
}
