package part_one.ex_three.utils;

import part_one.ex_three.interfaces.Operations;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils<T extends Number> implements Operations<T> {
    private final List<T> numbers;

    public NumberUtils(List<T> numbers) {
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
