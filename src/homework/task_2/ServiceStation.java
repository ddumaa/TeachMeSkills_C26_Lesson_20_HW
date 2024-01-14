package homework.task_2;

public class ServiceStation {
    private int car = 0;
    public synchronized void add (){
        while (car >= Consts.LIMIT_CAR){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car++;
        System.out.println("Added car\nCar at the service station " + car );
        notify();
    }
    public synchronized void get (){
        while (car < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car--;
        System.out.println("The car was taken\nCars left at the service station " + car);
        notify();
    }
}
