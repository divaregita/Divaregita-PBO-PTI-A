package praktikumpl;

public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee{" +
                "registrationNumber=" + registrationNumber +
                ", name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}');

        System.out.println("Invoices: ");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    public int calculateTotalDeductions() {
        int totalDeductions = 0;
        for (Invoice invoice : invoices) {
            totalDeductions += invoice.getPayableAmount();
        }
        return totalDeductions;
    }

    public abstract void someAbstractMethod();

    public static void someStaticMethod() {
        System.out.println("This is a static method in Employee class.");
    }
}
