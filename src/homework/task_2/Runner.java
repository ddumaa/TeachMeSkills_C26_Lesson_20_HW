package homework.task_2;

public class Runner {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        AddCar addCar = new AddCar(serviceStation);
        PickUpCar pickUpCar = new PickUpCar(serviceStation);

        new Thread(addCar).start();
        new Thread(pickUpCar).start();
    }
}
