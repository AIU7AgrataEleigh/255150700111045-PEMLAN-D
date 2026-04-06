public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Test Case 1 :");
        Manusia a = new Manusia("A", true, "111", true);
        System.out.println(a);

        System.out.println("------------------Test Case 2 :");
        MahasiswaFILKOM b = new MahasiswaFILKOM("B",false, "111", false, "165150300111100", 4.0);
        System.out.println(b);
        

        System.out.println("\n------------------Test Case 3 :");
        Pekerja c = new Pekerja("C", true, "111",true, 1000, 2016, 3, 2, 4);
        System.out.print(c);

        System.out.println("\n------------------Test Case 4 :");
        Manager d = new Manager("D", true, "111", true, 1000, 2017, 1, 2, 3, "HRD");
        System.out.print(d);


    } 
}

