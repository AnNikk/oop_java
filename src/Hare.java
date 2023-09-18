public class Hare extends Animal{
    private int earsLen;

    public Hare(String name, double weight, int earsLen) {
        setAnimalType("Травоядный");
        setAnimalName(name);
        setAnimalWeight(weight);
        this.earsLen = earsLen;
    }

    public int getEarsLen() {
        return earsLen;
    }

    public void setEarsLen(int earsLen) {
        this.earsLen = earsLen;
    }
}
