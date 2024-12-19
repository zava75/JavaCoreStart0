package lesson5_oop.workers;

public class Secretary extends OfficeWorkers{
    private int salary = 20000;
    public Secretary(boolean inMen) {
        super(inMen);

    }

    @Override
    public void getSalary() {
        System.out.printf("""
                Получила зарплату %d грн
                """, salary);
    }
}
