import java.time.LocalDate;
public class ProductionEmployee extends Employee {
    private int producedItems;
    private double wagePerItem;

    public ProductionEmployee(String name, String noKTP, LocalDate tanggalLahir, int producedItems, double wagePerItem) {
        super(name, noKTP, tanggalLahir);
        this.producedItems = producedItems;
        this.wagePerItem = wagePerItem;
    }

    @Override
    public double earnings() {
        return producedItems * wagePerItem;
    }
}
