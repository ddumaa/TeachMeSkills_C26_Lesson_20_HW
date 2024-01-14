package homework.task_1.option_1.imitation_morning;

public class Breakfast extends Thread{

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
