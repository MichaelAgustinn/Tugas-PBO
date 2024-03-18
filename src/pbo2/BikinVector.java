package pbo2;

public class BikinVector {
    int MAX_SIZE = 10;
    Double[] data = new Double[MAX_SIZE];
    int index = -1;

    // method isEmpty
    public boolean isEmpty() {
        boolean result = false;
        if (index < 0) {
            result = true;
        }
        return result;
    }
    // method isEmpty end

    // metod toString
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
    // method toString end

    // method add
    public void add(double value) {
        index++;
        if (index >= MAX_SIZE) {
            MAX_SIZE += 10;
            Double[] dataBaru = new Double[MAX_SIZE];
            for (int i = 0; i < dataBaru.length; i++) {
                dataBaru[i] = data[i];
            }
            data = dataBaru;
        }
        data[index] = value;
    }
    // method add end

    // method get
    public Double get(int i) {
        Double result = null;
        if (i >= 0 && i <= index) {
            result = data[i];
        }
        return result;
    }
    // method get end

    // method set
    public boolean set(int i, Double value) {
        boolean result = false;
        if (i >= 0 && i <= index) {
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
            data[index] = 0.0;
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
        Double[] dataBaru = new Double[MAX_SIZE];
        data = dataBaru;
        index = -1;
    }
    // method clear end
}
