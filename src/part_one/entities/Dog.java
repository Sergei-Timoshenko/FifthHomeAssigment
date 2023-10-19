package part_one.entities;

public class Dog extends Pet {
    public Dog(String name) {
        this.name = name;
        makeHappyAdoptingSound();
    }

    @Override
    public void makeHappyAdoptingSound() {
        System.out.println("Happy bark");
    }

    @Override
    public String forceOwnerToSayYourName() {
        return name;
    }
}
