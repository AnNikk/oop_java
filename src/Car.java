abstract class Car {
    private String model;
    private double power;
    private Engine engine;

    public void start(){
        System.out.println("Start");
        engine.start();
    }
    public void stop(){
        System.out.println("Stop");
        engine.stop();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }
}
