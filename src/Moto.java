abstract class Moto {
    private String model;
    private Engine engine;
    private Battery battery;

    public Moto() {
    }

    public Moto(String model, Engine engine, Battery battery) {
        this.model = model;
        this.engine = engine;
        this.battery = battery;
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBattery(Battery battery) {
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

}
