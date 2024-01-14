package homework.task_2;

import static java.lang.Thread.sleep;

public class AddCar implements Runnable {
    private ServiceStation serviceStation;
    public AddCar(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        addCar();
    }
    private void addCar(){
        for (int i = 1; i < 20; i++){
            serviceStation.add();
        }
    }
}
