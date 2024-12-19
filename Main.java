
import lesson.User;
import lesson3.Example1.Example1;
import lesson3.Example2.Example2;
import lesson4.EnumCatalog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        IntelLesson intel = new IntelLesson(22);
//        ArrayLesson arrayLesson = new ArrayLesson();

        User user = new User("Ivan",22);
        user.welcome();

        Example1 <User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("VADYM", 33));
        System.out.println(example1.get());
        System.out.println("-------------------------------");

//        Example2.simpleInit(new User());
        Example2<User> example2 = Example2.init(new User());
        example2.set(new User("RUSLAN", 53));
        System.out.println(example2.get());
        System.out.println(example2.getInstance());



        System.out.println("-------------------------------");

        System.out.println(EnumCatalog.USA);

        List <String> list = new ArrayList<>();
        List <String> list2 = new ArrayList<>();
        list.add(EnumCatalog.USA.getName());
        list.add(EnumCatalog.UKRAINE.getName());
        list.add(2,EnumCatalog.RUSSIA.getName());

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

        boolean b = list2.addAll(list);

        System.out.println(b);
//        System.out.println(list2.size());



    }
}