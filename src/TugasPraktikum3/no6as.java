package TugasPraktikum3;

import java.util.ArrayList;

public class no6as {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public boolean empty() {
        boolean result = false;
        if (data.isEmpty()) {
            result = true;
        }
        return result;
    }

    public Integer peek() {
        Integer result = null;
        if (!data.isEmpty()) {
            result = data.get(data.size() - 1);
        }
        return result;
    }

    public Integer pop() {
        Integer result = null;
        if (!data.isEmpty()) {
            result = data.get(data.size() - 1);
            data.remove(data.size() - 1);
        }
        return result;
    }

    @Override
    public String toString() {
        return data + "";
    }

    public void push(int value) {
        data.add(value);
    }
}
