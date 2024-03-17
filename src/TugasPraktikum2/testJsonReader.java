package TugasPraktikum2;

import java.util.ArrayList;

public class testJsonReader {
    public static void main(String[] args) {
        String address = "src/TugasPraktikum2/data.json";
        jsonReader jsr = new jsonReader();
        String json = jsr.readFString(address);

        ArrayList<MatKul> bacaFile = jsr.parseJson(json);
        for (MatKul mk : bacaFile) {
            System.out.println(mk);
        }
    }
}
