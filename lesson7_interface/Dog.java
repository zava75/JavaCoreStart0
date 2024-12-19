package lesson7_interface;

public abstract class Dog implements Animal,AllLife{
    public Dog(String name) {
        System.out.printf("Создан экземпляр собаки: %s%n", name);


    }
}
