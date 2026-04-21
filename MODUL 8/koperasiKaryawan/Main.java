public class Main {
    public static void main(String[] args) {

        
        Invoice[] invoices = new Invoice[2];
        invoices[0] = new Invoice("Minyak Goreng", 3, 50000);
        invoices[1] = new Invoice("Air Galon", 1, 20000);

        Payable[] payables = new Payable[4];

        payables[0] = new Invoice("Odol", 2, 5000);
        payables[1] = new Invoice("Susu", 2, 50000);
        payables[2] = new Invoice("Gula", 3, 7000);
        payables[3] = new Employee(102, "Sari", 4000000, invoices);

        System.out.println("=== DATA PAYABLE ===");

        for (Payable p : payables) {
            System.out.println("----------------------");

            if (p instanceof Employee) {
                ((Employee) p).display();
            } else if (p instanceof Invoice) {
                System.out.println(p); 
                System.out.println("Total Bayar: " + p.getPayableAmount());
            }
        }
    }
}