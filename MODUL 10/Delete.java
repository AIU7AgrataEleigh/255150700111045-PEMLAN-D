import java.io.File;
public class Delete {
    public static void main(String[] args) {
        // FILE 
        // var file = new File("test.txt"); (sebelumnya)
        var file = new File("D:/CODING/SEMESTER 2/OPERATING FILES/test.txt");
        if (file.exists()) {
            var result = file.delete();
            System.out.println((result ? "Berhasil" : "Gagal")
            + " menghapus file");
        } else {
            System.out.println("File tidak ada");
        }
    }
}