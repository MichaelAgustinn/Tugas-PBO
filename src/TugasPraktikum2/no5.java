package TugasPraktikum2;

import java.util.LinkedList;

public class no5 {
    public static void main(String[] args) {

        LinkedList<Double> data = new LinkedList<>();
        data.add(91.35);
        data.add(4.72);
        data.add(26.0);
        data.add(3.5);
        data.add(8.0);
        data.add(61.0);
        data.add(65.36);
        data.add(12.0);
        data.add(5.6);
        data.add(7.11);
        data.add(27.0);
        data.add(9.53);
        data.add(549.0);
        data.add(2.23);
        data.add(17.31);
        data.add(4.25);
        data.add(2.13);
        data.add(83.0);
        data.add(7.0);
        data.add(102.4);
        data.add(53.21);
        data.add(3.42);
        data.add(0.21);
        data.add(70.02);
        data.add(819.4);
        data.add(6173.0);
        data.add(4.25);
        data.add(19.8);
        data.add(17.32);
        data.add(5.768);

        double max = 0;
        double min = 99999;
        double sum = 0;
        int leng = 0;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > max) {
                max = data.get(i);
            }

            if (data.get(i) < min) {
                min = data.get(i);
            }

            leng++;
            sum += data.get(i);

        }
        double avg = sum / leng;

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);

    }
}
