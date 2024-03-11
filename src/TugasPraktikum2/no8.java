package TugasPraktikum2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

public class no8 {
    public static void main(String[] args) throws IOException {
        try {
        File file = new File("src/TugasPraktikum2/data.json");
        String bacaJson = Files.readString(file.toPath());
        System.out.println(bacaJson);    
        } catch (IOException ex) {
            Logger.getLogger(no8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
