package lesson;

public class User {
    private String name;
    private int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "User name: " + name + " age: " + age ;
    }

    public void welcome() {
        System.out.println( " Hi main name " + name + " to me " + age );
    }
}
