package lesson12_multyThread;

public class RunnableTimer implements Runnable {

    private String threadName;

    public RunnableTimer(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
