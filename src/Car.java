abstract class Car {
    private String model;
    private Engine engine;
    private Battery battery;

    public Car() {
    }

    public Car(String model, Engine engine, Battery battery) {
        this.model = model;
        this.engine = engine;
        this.battery = battery;
    }

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

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
