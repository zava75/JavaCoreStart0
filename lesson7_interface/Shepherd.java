package lesson7_interface;

public class Shepherd extends Dog{
    private String name;

    public Shepherd(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Овчарка может сесть");

    }

    @Override
    public void sleep() {
        System.out.println("Овчарка может спать");
    }

    @Override
    public void feed() {
        System.out.println("Овчарка может питатся");
    }
}
