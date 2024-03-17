package TugasPraktikum2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jsonReader {

    public String readFString(String fileName) {
        String json = null;
        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (in.hasNextLine()) {
                String baris = in.nextLine();
                sb.append(baris).append("\n");
            }
            json = sb.toString();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    public ArrayList<MatKul> parseJson(String json) {
        ArrayList<MatKul> bacaFile = null;
        String jsonA = json;
        Pattern patternA = Pattern.compile("\\{([^\\{^\\}]+)\\}");
        Matcher matcherA = patternA.matcher(jsonA);
        bacaFile = new ArrayList<>();
        while (matcherA.find()) {
            String jsonB = matcherA.group(1);
            Pattern patternB = Pattern.compile("\"([^\"]+)\":\\s*\"*([^\\^\"^\\,]+)\"*\\,*");
            Matcher matcherB = patternB.matcher(jsonB);
            String kode = null;
            String nama = null;
            int sks = 0;
            String nilai = null;
            while (matcherB.find()) {
                String key = matcherB.group(1);
                String value = matcherB.group(2);
                if (key.equals("Kode MK")) {
                    kode = value;
                } else if (key.equals("Matakuliah")) {
                    nama = value;
                } else if (key.equals("SKS")) {
                    sks = Integer.parseInt(value);
                } else if (key.equals("Nilai")) {
                    nilai = value;
                }
            }
            MatKul mk = new MatKul(kode, nama, sks, nilai);
            bacaFile.add(mk);
        }
        return bacaFile;
    }
        
}
