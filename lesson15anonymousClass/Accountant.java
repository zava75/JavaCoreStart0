package lesson15anonymousClass;

public class Accountant implements Reporting {

    @Override
    public void report(int mounts) {
        System.out.println("Отчет сформирован за " + mounts + " месяцев");
    }

    public void eats(){
        System.out.println("Бугалтер обедает");
    }
}
