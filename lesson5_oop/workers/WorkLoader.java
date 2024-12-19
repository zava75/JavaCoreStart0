package lesson5_oop.workers;

import lesson5_oop.Hunen;

public class WorkLoader extends Hunen {

    private int salary = 22000;

    public WorkLoader(boolean inMan) {
        super(inMan);
    }

    @Override
    public void getSalary() {
        System.out.printf("""
               Получил зарплату 
               %d грн \n""" ,salary);
    }
}
