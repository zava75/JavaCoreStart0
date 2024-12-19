package lesson1;

public class IntelLesson {
    private int id;
    private String name;

    public static void main(String[] args) {
        System.out.println("public static void main");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public IntelLesson(int id) {
        this.id = id;
        System.out.println("Hello IntelLesson! ID = " + String.valueOf(id));
    }
}
