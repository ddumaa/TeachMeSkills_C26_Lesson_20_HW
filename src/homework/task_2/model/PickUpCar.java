package homework.task_2.model;

import homework.task_2.model.ServiceStation;

public class PickUpCar implements Runnable {
    private ServiceStation serviceStation;

    public PickUpCar(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        pickUpCar();
    }
    private void pickUpCar(){
        for (int i = 1; i < 20; i++){
            serviceStation.get();
        }
    }
}
