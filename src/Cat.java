public class Cat extends Animal{
    private Wool wool;
    public Cat(String name, double weight, Wool wool) {
        setAnimalType("Хищник");
        setAnimalName(name);
        setAnimalWeight(weight);
        setWool(wool);
    }

    public Wool getWool() {
        return wool;
    }

    public void setWool(Wool wool) {
        this.wool = wool;
    }
}
enum Wool{
    ГЛАДКОШЕРСТНАЯ,
    СРЕДНЯЯ,
    ПУШИСТАЯ
};
