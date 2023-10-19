package part_one;

import part_one.entities.Cat;
import part_one.entities.Dog;
import part_one.entities.Pet;
import part_one.utils.PetUtils;

public class PartOne {
    public static void run() {
        Cat cat = new Cat("Mariia");
        Dog dog = new Dog("Bolt");

        Pet petWithLongestName = PetUtils.getLongestNamePet(cat, dog);
        System.out.println(petWithLongestName.forceOwnerToSayYourName());
    }
}
