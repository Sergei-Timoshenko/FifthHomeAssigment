package part_three.utils;

import part_three.interfaces.Operations;

import java.util.ArrayList;
import java.util.List;

public class PartThreeUtils<T extends Number> implements Operations<T> {
    private final List<T> numbers;

    public PartThreeUtils(List<T> numbers) {
        this.numbers = numbers;
    }

    @Override
    public <Q extends T> ArrayList<T> findNumbers(Q searchedNumber) {
        ArrayList<T> foundNumbers = new ArrayList<>();
        for (T number : numbers) {
            if (isEqual(number, searchedNumber)) {
                foundNumbers.add(number);
            }
        }
        return foundNumbers;
    }

    @Override
    public <Q extends T> Boolean isEqual(Q firstNumber, Q secondNumber) {
        return firstNumber.toString().equals(secondNumber.toString());
    }
}
