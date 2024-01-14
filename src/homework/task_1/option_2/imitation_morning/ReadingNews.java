package homework.task_1.option_2.imitation_morning;

import static java.lang.Thread.sleep;

public class ReadingNews implements Runnable{
    Thread thread;

    public ReadingNews() {
        thread = new Thread(this);
        thread.setName("Reading News");
        thread.setPriority(3);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("I read the news " );
        for (int i =0; i < 20; i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'm reading something interesting");
        }
        System.out.println("Finished reading the news");
    }
}
