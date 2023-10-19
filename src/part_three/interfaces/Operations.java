package part_three.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Operations<T> {
    public <Q extends T> ArrayList<T> findNumbers(Q searchedNumber);

    public <Q extends T> Boolean isEqual(Q firstNumber, Q secondNumber);
}
