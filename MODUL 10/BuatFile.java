import java.io.File;
import java.io.IOException;

public class BuatFile {
    public static void main(String[] args) {
        try{
            var folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            File file1 = new File(folder, "test.txt");
            File file2 = new File(folder, "test2.txt");

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File berhasil dibuat");
        } catch (IOException exception){
            System.err.println("Gagal membuat file");
        }
    }
    
}
