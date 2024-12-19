package lesson5_oop;

import lesson5_oop.workers.Accountant;
import lesson5_oop.workers.Secretary;
import lesson5_oop.workers.WorkLoader;

public class Runner  {
    public static void main(String[] args) {

        Secretary secretary = new Secretary(false);
        secretary.getSalary();
        secretary.DrinkingCoffee();
        System.out.println(secretary.name);
        System.out.println("-------------------------");

        Accountant accountant = new Accountant(false);
        accountant.getSalary();
        accountant.DrinkingCoffee();
        System.out.println(accountant.name);
        System.out.println("_________________________");

        WorkLoader workLoader = new WorkLoader(true);
        workLoader.getSalary();
        System.out.println("__________________________");
        System.out.println(workLoader.name);


    }
}
