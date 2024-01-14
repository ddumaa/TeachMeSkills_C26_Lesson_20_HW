package homework.task_1.option_1.imitation_morning;

public class ReadingNews extends Thread{

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
