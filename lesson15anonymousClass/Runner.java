package lesson15anonymousClass;

public class Runner {
    public static void main(String[] args) {

        Director director1 = new Director();
        Director director = director1;

        // anonymousClass
        director.forse(new Reporting() {
            @Override
            public void report(int mounts) {
                System.out.println("Отчет сформирован за " + mounts + " месяцев");
            }
        }, 10);


        Reporting reporting = new Accountant();
        reporting.report(12);

        director1.forse(reporting ,3);

        Accountant accountant = new Accountant();
        director1.forse(accountant,9);

        Reporting reporting1 = reporting;
        reporting1.report(12);

        Accountant accountant2 = new Accountant();
        director1.forse(accountant2,9);


    }
}
