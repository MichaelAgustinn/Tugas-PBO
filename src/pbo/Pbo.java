package pbo;

import java.util.Vector;

public class Pbo {
    public static void main(String[] args) {
        Vector<Double> uhuyy = new Vector<Double>();
        double[][] data = {
                { 91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11 },
                { 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4 },
                { 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.32, 5.768 }
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                uhuyy.add(data[i][j]);
            }
        }

        double min = 99999;
        double max = 0;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < uhuyy.size(); i++) {
            if (uhuyy.get(i) > max) {
                max = uhuyy.get(i);
            }
            if (uhuyy.get(i)<min) {
                min = uhuyy.get(i);
            }
            sum = sum + uhuyy.get(i);
        }
        avg = sum/uhuyy.size();

        System.out.println("max = "+max+"\nmin = "+min+"\nsum = "+sum+"\navg = "+avg);

    }
}
