public class Gazel extends Car {
    private int power = 123;
    private int capacity = 60;
    private Engine engine = new Engine(power, "GazelEngine");
    private Battery battery = new Battery(60);
    public Gazel() {
        super();
        setModel("GAZ-11223344");
        setEngine(engine);
        setBattery(battery);
    }

    @Override
    public void start(){
        super.start();
    }


}
