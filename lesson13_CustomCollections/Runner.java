package lesson13_CustomCollections;

public class Runner {

    public static void main(String[] args) {
        MyArrayString myArrayString = new MyArrayString();


        for(int i = 0 ; i < 10 ; i++){
            myArrayString.addString("Hello");
            myArrayString.addString("World");
        }

        System.out.println(myArrayString);
        System.out.println("___________________________");

        myArrayString.removeString("Hello");
       System.out.println(myArrayString);
        System.out.println(myArrayString.getStringAtIndex(1));
        myArrayString.removeStringAtIndex(1);
        System.out.println(myArrayString.getStringAtIndex(1));

    }
}
