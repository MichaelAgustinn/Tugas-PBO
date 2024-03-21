package TugasPraktikum3;

import java.util.LinkedList;

public class no6linked {
    LinkedList<Integer> data = new LinkedList<Integer>();

    public void push(int value) {
        data.add(value);
    }

    public int peek() {
        int value = data.get(data.size() - 1);
        return value;
    }

    public int pop() {
        int value = data.get(data.size() - 1);
        data.remove(data.get(data.size() - 1));
        return value;
    }

    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data + "";
    }
}
