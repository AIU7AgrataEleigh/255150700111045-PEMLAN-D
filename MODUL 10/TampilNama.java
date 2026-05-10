import java.io.File;

public class TampilNama{
    public static void main(String[] args) {

    //RUNTUTAN NOMOR 3
    var file = new File(".");

    String[] daftarFile = file.list();

    if (file.exists() && file.isDirectory()){
        System.out.println("Isi direktori: " + file.getAbsolutePath());

        if (daftarFile !=null) {
            int no = 1;
            for(int i = 0; i < daftarFile.length; i++){
                File f = new File(file, daftarFile[i]);

                if(f.isFile()){
                    System.out.println(no++ + ". " + daftarFile[i]);
                }
            }
        }
    }
    }
}