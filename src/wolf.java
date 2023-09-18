public class wolf extends Animal{
    private String color;

    public wolf(String name, double weight, String color) {
        this.color = color;
        setAnimalType("Хищник");
        setAnimalName(name);
        setAnimalWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
