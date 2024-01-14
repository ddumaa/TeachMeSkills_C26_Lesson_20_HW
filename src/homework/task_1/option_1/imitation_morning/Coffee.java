package homework.task_1.option_1.imitation_morning;

public class Coffee extends Thread{

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
