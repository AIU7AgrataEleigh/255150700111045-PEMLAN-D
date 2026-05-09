import java.io.File;
import java.util.Date;
public class FileInfo {
    public static void main(String[] args) {
        var file = new File("test.txt");
        System.out.println("File ada? " + file.exists());
        System.out.printf("Path: %s\n", file.getAbsolutePath());
        System.out.println("Last modified: " + new Date(file.lastModified()));
        System.out.printf("Ukuran file: %d bytes\n", file.length());
        System.out.println("File bisa dibaca? " + file.canRead());
        System.out.println("File bisa ditulis? " + file.canWrite());
        System.out.println("Apakah sebuah direktori? " + file.isDirectory());
        System.out.println("Apakah sebuah file? " + file.isFile());
        System.out.println("Apakah hidden? " + file.isHidden());

        if(file.exists()){
            long bytes = file.length();

            double kilobytes = bytes /1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("Nama File: " + file.getName());
            if (megabytes < 1) {
                System.out.println("Ukuran File: " + kilobytes + " KB");
            } else {
                System.out.println("Ukuran File: " + megabytes + " MB");
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}