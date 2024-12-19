package lesson8_interfece;

public class Runner {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        Fish fish = new Fish();
        Duck duck = new Duck();


        Swimable[] swimables = new Swimable[2];
        swimables[0] = duck;
        swimables[1] = fish;


        Flyable[] flyables = {airplane, duck};


        for(Swimable swimable : swimables){
            swimable.swim();
        }

        for(Flyable flyable : flyables){
            flyable.fly();
        }

    }

}
