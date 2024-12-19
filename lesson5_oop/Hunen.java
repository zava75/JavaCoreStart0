package lesson5_oop;

public abstract class Hunen {

    protected String name = "Человек";

    private boolean inMen;

    private String nameClass;

    public Hunen(boolean inMen) {
        this.inMen = inMen;
        System.out.println(this.toString());
        System.out.println(inMen ? "Мужчина" : "Женщина");
    }

    public abstract void getSalary();

    @Override
    public String toString() {
        String nameClass = this.getClass().getName();
        return nameClass;
    }

}
