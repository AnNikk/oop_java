public class Dog extends Animal {
    private DogType dogType;

    public Dog(String name, double weight, DogType dogType) {
        setAnimalType("Хищник");
        setAnimalName(name);
        setAnimalWeight(weight);
        setDogType(dogType);
    }

    public DogType getDogType() {
        return dogType;
    }

    public void setDogType(DogType dogType) {
        this.dogType = dogType;
    }
}
enum DogType{
    БОЙЦОВСКАЯ,
    СТОРОЖЕВАЯ,
    ОХОТНИЧЬЯ,
    КОМНАТНАЯ
};
