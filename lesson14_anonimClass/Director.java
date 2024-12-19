package lesson14_anonimClass;

public class Director {
    public void force(Counter counter, int i) {
        String report = counter.report(i);
        System.out.println(report);
    }
}
