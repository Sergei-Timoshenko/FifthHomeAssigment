package part_one.ex_one.utils;

import part_one.ex_one.entities.Pet;

public class PetUtils {
    public static <T extends Pet> T getLongestNamePet(T firstPet, T secondPet) {
        String firstPetName = firstPet.forceOwnerToSayYourName();
        String secondPetName = secondPet.forceOwnerToSayYourName();
        return (firstPetName.length() > secondPetName.length()) ? firstPet : secondPet;
    }
}
