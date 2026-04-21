public class Employee implements Payable {
    
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getTotalInvoice(){
        int total = 0;
        for(Invoice invoice : invoices){
            total += invoice.getPayableAmount();
        }
        return total;
    }

    @Override
    public int getPayableAmount(){
        return salaryPerMonth - getTotalInvoice();
    }

    public void display() {
        System.out.println("ID: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji Awal: " + salaryPerMonth);

        System.out.println("Detail Belanja:");
        for (Invoice inv : invoices) {
            System.out.println("- " + inv);
        }

        System.out.println("Total Belanja: " + getTotalInvoice());
        System.out.println("Gaji Setelah Potongan: " + getPayableAmount());
    }
}