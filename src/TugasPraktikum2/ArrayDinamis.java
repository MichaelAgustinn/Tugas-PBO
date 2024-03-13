package TugasPraktikum2;

import java.util.Arrays;

public class ArrayDinamis {
    Object[] Array;
    int size;
    int muatanAwal = 10;

    // method pembuatan
    public void Arrays() {
        Array = new Object[muatanAwal];
        size = 0;
    }
    // method pembuatan end

    // menambah kapasitas array
    public void increaseCapacity() {
        int newCapacity = Array.length * 2;
        Array = Arrays.copyOf(Array, newCapacity);
    }
    // method increase end

    // method add
    public void add(Object element) {
        if (size == Array.length) {
            increaseCapacity();
        }
        Array[size] = element;
        size++;
    }
    // method add end

}
