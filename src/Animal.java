abstract class Animal {
    private String animalType;
    private String animalName;
    private double animalWeight;

    public void Voice(String sound){
        System.out.println(sound);
    };
    public void Jump(int len, int height){
        if (len == 0 && height == 0) {
            System.out.println("Я не умею прыгать");
        } else {
            System.out.println("Я прыгаю на " + len + " метров в длину и на " + height + " метров в высоту");
        }
    };

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }
}
