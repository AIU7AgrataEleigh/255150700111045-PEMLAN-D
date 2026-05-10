import java.io.File;
public class Delete2 {
    public static void main(String[] args) {
        var folder = new File("data");

        if (folder.exists() && folder.isDirectory()) {
            var files = folder.listFiles();

            if (files != null) {
                for (var file : files) {
                    file.delete();
                }
            }
            folder.delete();
            System.out.println("Folder berhasil dihapus");
        }
    }
    
}
