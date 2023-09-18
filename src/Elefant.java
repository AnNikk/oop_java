public class Elefant extends Animal{
    private int trunkLen;

    public Elefant(String name, double weight, int trunkLen) {
        setAnimalType("Травоядный");
        setAnimalName(name);
        setAnimalWeight(weight);
        this.trunkLen = trunkLen;
    }

    public int getTrunkLen() {
        return trunkLen;
    }

    public void setTrunkLen(int trunkLen) {
        this.trunkLen = trunkLen;
    }
}
