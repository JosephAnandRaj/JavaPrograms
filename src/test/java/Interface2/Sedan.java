package Interface2;

public class Sedan implements Car {

    private String model;

    public Sedan(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(model + " engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(model + " engine stopped.");
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving.");
    }
}
