package homework.task_2;

import homework.task_2.model.AddCar;
import homework.task_2.model.PickUpCar;
import homework.task_2.model.ServiceStation;

/**
 * There is a service station. There can be a maximum of a certain number of cars in service per hundred.
 * Create a class that will run in a separate thread and will add cars for service at the service station.
 * Create a class that will run in a separate thread and will pick up fixed cars from the service station.
 */
public class Runner {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        AddCar addCar = new AddCar(serviceStation);
        PickUpCar pickUpCar = new PickUpCar(serviceStation);

        new Thread(addCar).start();
        new Thread(pickUpCar).start();
    }
}
