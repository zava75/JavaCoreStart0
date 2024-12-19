package lesson5_oop.workers;

import lesson5_oop.Hunen;

public abstract class OfficeWorkers extends Hunen {

    public OfficeWorkers(Boolean inMen) {
        super(inMen);
    }

    public void DrinkingCoffee(){
        System.out.println("Drinking Coffee");
    }
}
