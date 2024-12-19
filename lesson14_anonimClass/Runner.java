package lesson14_anonimClass;

public class Runner {
    public static void main(String[] args) {

        Director director = new Director();

        Counter counter = new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "";
            }
        };



    }
}
