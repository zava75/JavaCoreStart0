package lesson5_oop.workers;

public class Accountant extends OfficeWorkers {

    private int salary = 28000;

    public Accountant(boolean inMen) {
        super(inMen);
    }

    @Override
    public void getSalary() {
        System.out.printf("""
                Получила зарплату %d грн
                """, salary);
    }

}
