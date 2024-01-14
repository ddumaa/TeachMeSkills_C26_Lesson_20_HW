package homework.task_1.option_2.imitation_morning;

import static java.lang.Thread.sleep;

public class Breakfast implements Runnable{
    Thread thread;

    public Breakfast() {
        thread = new Thread(this);
        thread.setName("Breakfast");
        thread.setPriority(8);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("I eat breakfast " );
        for (int i =0; i < 10; i++){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Yum Yum");
        }
        System.out.println("Had breakfast");
    }
}
