package lesson8_interfece;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {

        System.out.println("Duck Утка летает");


    }

    @Override
    public void swim() {

        System.out.println("Duck Утка плавает");

    }
}
