package Summary2;

public class Mechanic implements SpecialService{
    public void service(Object car){
        commomService();
        washCar();
        specialService(car);
    }
    //TODO instead of interface create abstract class to realise specialService

    private void washCar() {
        System.out.println("Washing a car");
    }

    private void commomService() {
        System.out.println("Common service for a car");
    }


    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        Tesla tesla = new Tesla();
        tesla.engine = "b1";
        mechanic.service(tesla);

    }

}


