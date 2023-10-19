package part_one.utils;

import part_one.entities.Pet;

public class PartOneUtils {
    public static <T extends Pet> T getLongestNamePet(T firstPet, T secondPet) {
        String firstPetName = firstPet.forceOwnerToSayYourName();
        String secondPetName = secondPet.forceOwnerToSayYourName();
        return (firstPetName.length() > secondPetName.length()) ? firstPet : secondPet;
    }
}
