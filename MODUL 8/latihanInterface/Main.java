package latihanInterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------------");
        System.out.println("Halo, masukkan informasi dibawah ini : ");
        System.out.println();
        System.out.print("Masukkan nama hewan : ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan umur hewan : ");
        int umurHewan = input.nextInt();
        System.out.println();
        input.nextLine();
        System.out.print("Masukkan nama manusia : ");
        String namaManusia = input.nextLine();
        System.out.print("Masukkan umur manusia : ");
        int umurManusia = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.println("---------------------------------------------------");

        Hewan animal = new Hewan(namaHewan, umurHewan);
        System.out.println("Data objek 1 : ");
        animal.berjalan();
        animal.makan();
        animal.bersuara();
        animal.tampilkanNama();
        animal.tampilkanUmur();
        System.out.println();

        System.out.println("Data objek 2 : ");
        Manusia human = new Manusia(namaManusia, umurManusia);
        human.berjalan();
        human.makan();
        human.bersuara();
        human.tampilkanNama();
        human.tampilkanUmur();
        System.out.println();

        System.out.println("Data objek 3 : ");
        Hewan animal2 = new Hewan("Paus", 5);
        animal2.bernapas();
        animal2.tidur();
        animal2.tampilkanNama();
        animal2.tampilkanUmur();  

        input.close();
    }
    
}
