package TugasPraktikum3;

public class no6array {
    int kepala = -1;
    int max_size = 10;
    int[] data = new int[max_size];

    public boolean empty() {
        boolean result = false;
        if (kepala < 0) {
            result = true;
        }
        return result;
    }

    public void test() {
        System.out.println(kepala);
    }

    public String toString() {
        String isi = "[";
        for (int i = 0; i <= kepala; i++) {
            if (i > 0) {
                isi += ", ";
            }
            isi += data[i];
        }
        isi += "]";
        return isi;
    }

    public Integer peek() {
        Integer result = null;
        if (kepala >= 0) {
            result = data[kepala];
        }
        return result;
    }

    public void push(int value) {
        kepala++;
        if (kepala >= max_size) {
            max_size += 10;
            int[] dataBaru = new int[max_size];
            for (int i = 0; i < data.length; i++) {
                dataBaru[i] = data[i];
            }
            data = dataBaru;
        }
        data[kepala] = value;
    }

    public Integer pop() {
        if (empty()) {
            return null;
        } else {
            return data[kepala--];
        }
    }

}
