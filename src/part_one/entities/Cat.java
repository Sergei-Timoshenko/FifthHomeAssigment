package part_one.entities;

public class Cat extends Pet {
    public Cat(String name) {
        this.name = name;
        makeHappyAdoptingSound();
    }

    @Override
    public void makeHappyAdoptingSound() {
        System.out.println("Happy meow");
    }

    @Override
    public String forceOwnerToSayYourName() {
        return name;
    }
}
