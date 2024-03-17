package pbo2;

public class BikinArrayList2 {
    int MAX_SIZE = 10;
    int[] data = new int[MAX_SIZE];
    int index = -1;

    // method isEmpty area
    public boolean isEmpty() {
        if (index < 0) {
            return true;
        }
        return false;
    }
    // method isEmpty end

    // method print area
    public String toString() {
        String isi = "[";
        if (index >= 0) {
            for (int i = 0; i <= index; i++) {
                if (i > 0) {
                    isi += ", ";
                }
                isi += data[i];
            }
        }
        isi += "]";
        return isi;
    }
    // method print end

    // method add area
    public void add(int value) {
        index++;
        if (index >= MAX_SIZE) {
            MAX_SIZE += 10;
            int[] newData = new int[MAX_SIZE];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[index] = value;
    }
    // method add end

    // method get area
    public Integer get(int i) {
        Integer result = null;
        if (i <= index && i >= 0) {
            result = data[i];
        }
        return result;
    }
    // method get end

    // method set area
    public boolean set(int i, int value) {
        boolean result = false;
        if (i <= index && i >= 0) {
            data[i] = value;
            result = true;
        }
        return result;
    }
    // method set end

    // method remove area
    public boolean remove(int i) {
        boolean result = false;
        if (i <= index && i >= 0) {
            for (int j = i; j < index; j++) {
                data[j] = data[j + 1];
            }
            data[index] = 0;
            if (i != index) {
                index--;
            }
            if (i == index) {
                index--;
            }
            result = true;
        }
        return result;
    }

    // method remove end

    // method size area
    public Integer size() {
        Integer result = index + 1;
        if (index < 0) {
            result = null;
        }
        return result;
    }
    // method size end

    // method clear area
    public void clear() {
        int[] dataBaru = new int[MAX_SIZE];
        data = dataBaru;
        index = -1;
    }
    // method clear end

}
