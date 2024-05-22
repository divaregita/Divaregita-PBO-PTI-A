package praktikumpl;

public class Main2 {
public static void main(String[] args) {
    Invoice invoice1 = new Invoice("Product1", 2, 200);
    Invoice invoice2 = new Invoice("Product2", 1, 400);
    Invoice[] invoices = {invoice1, invoice2};

    InternEmployee intern = new InternEmployee(123, "Dipaa", 2000, invoices, 6);
    intern.displayEmployeeDetails();
    intern.internDetails();
    intern.attendTrainingSession();
    intern.trackContractDuration();
    intern.extendInternship(3);
    intern.trackContractDuration();
    intern.someAbstractMethod();

    System.out.println("Payable Amount: " + intern.getPayableAmount());
    }
}
