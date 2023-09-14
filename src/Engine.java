public class Engine {
    private double power;
    private String model;

    public double getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("Grrrr");
    }

    public void stop(){
        System.out.println("Tssss");
    }
}
