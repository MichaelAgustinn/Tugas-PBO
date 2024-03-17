package pbo2;

public class bikinArrayL {
    private int MAX_SIZE = 10;
    private double[] values = new double[MAX_SIZE];
    private int index = -1;

    // method isEmpty
    public boolean isEmpty() {
        boolean result = false;
        if (index < 0) {
            result = true;
        }
        return result;
    }
    // method isEmpty End

    // method size
    public int size() {
        return index + 1;
    }
    // method size end

    // method add
    public void add(double v) {
        index++;
        if (index >= MAX_SIZE) {
            MAX_SIZE = MAX_SIZE + 10;
            double[] newValues = new double[MAX_SIZE];
            for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[index] = v;
    }
    // method add end

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= index; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(values[i]);
        }
        sb.append("]");
        String result = sb.toString();
        return result;  
    }

}
