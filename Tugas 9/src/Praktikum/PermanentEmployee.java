package praktikumpl;

public class PermanentEmployee extends Employee {
    private int bonus;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int bonus) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.bonus = bonus;
    }

    public int calculateBonus() {
        return bonus;
    }

    @Override
    public int getPayableAmount() {
        return getSalaryPerMonth() - calculateTotalDeductions() + calculateBonus();
    }

    @Override
    public void someAbstractMethod() {
        System.out.println("Abstract method implemented in PermanentEmployee.");
    }
}
