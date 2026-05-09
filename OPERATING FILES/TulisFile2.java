import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class TulisFile2 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var path = Paths.get("test.txt");
        System.out.print("Masukkan teks yang akan disimpan: ");

        var text = keyboard.nextLine();
        
        try {
            Files.writeString(path, text, StandardOpenOption.APPEND); //files kelas
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
    }
}

//path dibuat untuk membuat file
//biar filenya nggak ilang kita import java.nio