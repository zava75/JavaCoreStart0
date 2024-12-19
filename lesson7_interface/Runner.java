package lesson7_interface;

public class Runner {
    public static void main(String[] args) {

        Shepherd shepherd = new Shepherd("Овчарка");
//        shepherd.eat();
//        shepherd.sleep();
//        shepherd.feed();

        Test test = new Test();
        test.Test(shepherd);
        test.Test1(shepherd);


    }
}
