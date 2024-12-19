package lesson8_interfece;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish рыба плавает");
    }
}
