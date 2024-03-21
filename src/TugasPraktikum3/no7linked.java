package TugasPraktikum3;

import java.util.LinkedList;

public class no7linked {
    LinkedList<Integer> data = new LinkedList<Integer>();

    public void offer(int value) {
        data.add(value);
    }

    public int peek() {
        int value = data.get(0);
        return value;
    }

    public int poll() {
        int value = data.get(0);
        data.remove(0);
        return value;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
