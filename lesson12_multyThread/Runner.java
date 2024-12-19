package lesson12_multyThread;

public class Runner {

    static boolean vin = false;

    public static void main(String[] args) {

        int numberRandom = (int)(Math.random()*1000000);

        Thread timer1 = new Thread(new Runnable() {
            public void run() {
                int numberCustomCheck = 0;
                try {
                    while (!vin) {
                        System.out.println(numberCustomCheck);
                        numberCustomCheck++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


    }

}


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println("Runnable 1 : " + i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new RunnableTimer("Runnable 2")).start();
//        new Thread(new RunnableTimer("Runnable 3")).start();
//}
//}
