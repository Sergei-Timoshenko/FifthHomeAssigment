package part_two;

import part_two.utils.ObjectUtils;

import java.util.ArrayList;

public class PartTwo {
    public static void run() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(0);
        integers.add(1);
        System.out.println(ObjectUtils.getCountOfUniqueObjects(integers));
    }
}
