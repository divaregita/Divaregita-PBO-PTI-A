import java.time.LocalDate;
// import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan tanggal lahir menggunakan LocalDate
       LocalDate tanggalLahir = LocalDate.of(1995, 5, 25);

        // Membuat objek karyawan dengan tanggal lahir
        SalariedEmployee salariedEmployee = new SalariedEmployee("Najwa", "125", tanggalLahir, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Zila", "264", tanggalLahir, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Ariel", "245", tanggalLahir, 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Hasan", "134", tanggalLahir, 5000, 0.04, 300);

        // Mendapatkan bulan saat ini
        LocalDate today = LocalDate.now();
        int bulanSekarang = today.getMonthValue();

        // Menghitung gaji secara polimorfisme dan menambahkan 100.000 jika bulan ini adalah bulan ulang tahun karyawan
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};
        for (Employee employee : employees) {
            double earnings = employee.earnings();
            System.out.println(employee.getName() + "'s earnings: $" + earnings);
            if (bulanSekarang == employee.getTanggalLahir().getMonthValue() && today.getDayOfMonth() == employee.getTanggalLahir().getDayOfMonth()) {
                earnings += 100000;
                System.out.println("This month is " + employee.getName() + "'s birthday month. Additional bonus: $100000");
            }
            System.out.println("Total earnings after bonus: $" + earnings + "\n");
        }
    }
}
