package part_one.ex_three;

import part_one.ex_three.utils.NumberUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class PartThree {
    public static void run() {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(.0);
        doubles.add(.1);
        doubles.add(.2);
        doubles.add(.0);
        doubles.add(.0);

        NumberUtils<Double> doubleUtils = new NumberUtils<>(doubles);
        ArrayList<Double> foundDoubles = doubleUtils.findNumbers(.0);
        System.out.println(Arrays.toString(foundDoubles.toArray()));
    }
}
