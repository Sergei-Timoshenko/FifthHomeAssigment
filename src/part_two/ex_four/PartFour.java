package part_two.ex_four;

import part_two.ex_four.entities.Audio;
import part_two.ex_four.entities.Image;
import part_two.ex_four.entities.Media;
import part_two.ex_four.entities.Video;

import java.util.ArrayList;

public class PartFour {
    public static void run() {
        ArrayList<Media> media = new ArrayList<>();

        Media firstMedia = new Audio("Meow",  10L, 1L);
        Media secondMedia = new Video("How to open a fridge", 100L, 10L);
        Media thirdMedia = new Image("Serhii's photo", 50L, 16, 9);

        media.add(firstMedia);
        media.add(secondMedia);
        media.add(thirdMedia);

        media.forEach(Media::displayInfo);
    }
}
