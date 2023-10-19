package part_one.ex_three.interfaces;

import java.util.ArrayList;

public interface Operations<T> {
    public <Q extends T> ArrayList<T> findNumbers(Q searchedNumber);

    public <Q extends T> Boolean isEqual(Q firstNumber, Q secondNumber);
}
