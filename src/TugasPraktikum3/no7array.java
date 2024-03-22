package TugasPraktikum3;

public class no7array {
    int index = -1;
    int max_size = 10;
    int[] data = new int[max_size];

    public void offer(int value) {
        index++;
        if (index >= max_size) {
            max_size += 10;
            int[] dataBaru = new int[max_size];
            for (int i = 0; i < data.length; i++) {
                dataBaru[i] = data[i];
            }
            data = dataBaru;
        }
        data[index] = value;
    }

    public String toString() {
        String isi = "[";
        for (int i = 0; i <= index; i++) {
            if (i > 0) {
                isi += ", ";
            }
            isi += data[i];
        }
        isi += "]";
        return isi;
    }

    public Integer poll() {
        if (index < 0) {
            return null;
        }
        int simpan = data[0];
        data[0] = 0;
        for (int i = 0; i < index; i++) {
            data[i] = data[i + 1];
        }
        data[index] = 0;
        index--;
        return simpan;
    }

    public Integer peek() {
        Integer result = null;
        if (index >= 0) {
            result = data[0];
        }
        return result;
    }

}
