package homework.task_1.option_2.imitation_morning;

import static java.lang.Thread.sleep;

public class Coffee implements Runnable{
    Thread thread;

    public Coffee() {
        thread = new Thread(this);
        thread.setName("Coffee");
        thread.setPriority(5);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("I'm drinking coffee " );
        for (int i =0; i < 10; i++) {
            try {
                sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Drink");
        }
        System.out.println("Finished my coffee");
    }
}
