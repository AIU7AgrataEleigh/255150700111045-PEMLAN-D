import java.util.*;

public class Main {
    public static void main(String[] args) {

        // JAWABAN 2a (ArrayList<Player> timA & timB)
        ArrayList<Player> timA = new ArrayList<>(Arrays.asList(
            new Player(168,50),
            new Player(170,60),
            new Player(165,56),
            new Player(168,55),
            new Player(172,60),
            new Player(170,70),
            new Player(169,66),
            new Player(165,56),
            new Player(171,72),
            new Player(166,56)
        ));

        ArrayList<Player> timB = new ArrayList<>(Arrays.asList(
            new Player(170,66),
            new Player(167,60),
            new Player(165,59),
            new Player(166,58),
            new Player(168,58),
            new Player(175,71),
            new Player(172,68),
            new Player(171,68),
            new Player(168,65),
            new Player(169,60)
        ));

        System.out.println("JAWABAN NOMOR 1");
        System.out.println();
        System.out.println("BAGIAN A");
        System.out.println("1a. ASCENDING TINGGI BADAN TIM A ");
        Collections.sort(timA, (a,b) -> a.tinggi - b.tinggi);
        printTable(timA);

        System.out.println("\n1a. DESCENDING TINGGI BADAN TIM A");
        Collections.sort(timA, (a,b) -> b.tinggi - a.tinggi);
        printTable(timA);

        System.out.println("\n1a. ASCENDING TINGGI BADAN TIM B");
        Collections.sort(timB, (a,b) -> a.tinggi - b.tinggi);
        printTable(timB);

        System.out.println("\n1a. DESCENDING TINGGI BADAN TIM B");
        Collections.sort(timB, (a,b) -> b.tinggi - a.tinggi);
        printTable(timB);

        System.out.println("\nBAGIAN B");

        System.out.println("1b. ASCENDING BERAT BADAN TIM A");
        Collections.sort(timA, (a,b) -> a.berat - b.berat);
        printTable(timA);

        System.out.println("\n1b. DESCENDING BERAT BADAN TIM A");
        Collections.sort(timA, (a,b) -> b.berat - a.berat);
        printTable(timA);

        System.out.println("\n1b. ASCENDING BERAT BADAN TIM B");
        Collections.sort(timB, (a,b) -> a.berat - b.berat);
        printTable(timB);

        System.out.println("\n1b. DESCENDING BERAT BADAN TIM B");
        Collections.sort(timB, (a,b) -> b.berat - a.berat);
        printTable(timB);

        System.out.println("\nBAGIAN C");
        System.out.println("1c. MAX & MIN TIM A");

        Player maxTinggiA = Collections.max(timA, Comparator.comparingInt(p -> p.tinggi));
        Player minTinggiA = Collections.min(timA, Comparator.comparingInt(p -> p.tinggi));

        Player maxBeratA = Collections.max(timA, Comparator.comparingInt(p -> p.berat));
        Player minBeratA = Collections.min(timA, Comparator.comparingInt(p -> p.berat));

        System.out.println("Max Tinggi A: " + maxTinggiA);
        System.out.println("Min Tinggi A: " + minTinggiA);
        System.out.println("Max Berat A: " + maxBeratA);
        System.out.println("Min Berat A: " + minBeratA);

        System.out.println("\n1c. MAX & MIN TIM B");

        Player maxTinggiB = Collections.max(timB, Comparator.comparingInt(p -> p.tinggi));
        Player minTinggiB = Collections.min(timB, Comparator.comparingInt(p -> p.tinggi));

        Player maxBeratB = Collections.max(timB, Comparator.comparingInt(p -> p.berat));
        Player minBeratB = Collections.min(timB, Comparator.comparingInt(p -> p.berat));

        System.out.println("Max Tinggi B: " + maxTinggiB);
        System.out.println("Min Tinggi B: " + minTinggiB);
        System.out.println("Max Berat B: " + maxBeratB);
        System.out.println("Min Berat B: " + minBeratB);

        System.out.println("\nBAGIAN D");
        System.out.println("1d. COPY TIM B KE TIM C");

        ArrayList<Player> timC = new ArrayList<>(Collections.nCopies(timB.size(), null));

        Collections.copy(timC, timB);

        printTable(timC);

        System.out.println("\nJAWABAN NOMOR 2");

        System.out.println("\nBAGIAN B");
        System.out.println("2b. SEARCH TINGGI TIM B");

        ArrayList<Integer> tinggiB = new ArrayList<>();
        for(Player p : timB){
            tinggiB.add(p.tinggi);
        }

        Collections.sort(tinggiB);

        System.out.println("Jumlah tinggi 168: " + Collections.frequency(tinggiB,168));
        System.out.println("Jumlah tinggi 160: " + Collections.frequency(tinggiB,160));

        System.out.println("\nBAGIAN C");
        System.out.println("2c. SEARCH BERAT TIM A");

        ArrayList<Integer> beratA = new ArrayList<>();
        for(Player p : timA){
            beratA.add(p.berat);
        }

        Collections.sort(beratA);

        System.out.println("Jumlah berat 56: " + Collections.frequency(beratA,56));
        System.out.println("Jumlah berat 53: " + Collections.frequency(beratA,53));

        System.out.println("\nBAGIAN D");
        System.out.println("2d. DATA YANG SAMA ANTARA TIM A & B");

        //-- cek tinggi
        Set<Integer> tinggiA = new HashSet<>();
        Set<Integer> tinggiSama = new HashSet<>();

        for(Player p : timA){
            tinggiA.add(p.tinggi);
        }

        for(Player p : timB){
            if(tinggiA.contains(p.tinggi)){
                tinggiSama.add(p.tinggi);
            }
        }

        //--cek berat 
        Set<Integer> beratASet = new HashSet<>();
        Set<Integer> beratSama = new HashSet<>();

        for(Player p : timA){
            beratASet.add(p.berat);
        }

        for(Player p : timB){
            if(beratASet.contains(p.berat)){
                beratSama.add(p.berat);
            }
        }

        System.out.println("\nCEK TINGGI");
        if(tinggiSama.isEmpty()){
            System.out.println("Tidak ada tinggi yang sama");
        } else {
            System.out.println("Ada tinggi yang sama");
            System.out.println("Tinggi yang sama: " + tinggiSama);
        }

        System.out.println("\nCEK BERAT");
        if(beratSama.isEmpty()){
            System.out.println("Tidak ada berat yang sama");
        } else {
            System.out.println("Ada berat yang sama");
            System.out.println("Berat yang sama: " + beratSama);
        }
    }

    public static void printTable(List<Player> list){
        System.out.printf("%-5s %-10s %-10s\n", "No", "Tinggi", "Berat");
        int no = 1;
        for(Player p : list){
            System.out.printf("%-5d %-10d %-10d\n", no++, p.tinggi, p.berat);
        }
    }
}