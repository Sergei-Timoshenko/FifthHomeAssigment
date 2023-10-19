package part_four.ex_six;

import part_four.ex_six.entities.Unit;
import part_four.ex_six.entities.Archer;
import part_four.ex_six.entities.Warrior;
import part_four.ex_six.entities.Wizard;
import part_four.ex_six.utils.UnitUtils;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PartSix {
    static ScheduledExecutorService duelThread = Executors.newSingleThreadScheduledExecutor();

    public static void run() {
        ArrayList<Unit> units = new ArrayList<>();
        Unit archer = new Archer("Archer", 100.0, 2.0, 10.0, 1L);
        Unit warrior = new Warrior("Warrior", 100.0, 5.0, 18.0, 2L);
        Unit wizard = new Wizard("Wizard", 100.0, 2.0, 40.0, 4L);

        units.add(archer);
        units.add(warrior);
        units.add(wizard);

        // Remove random unit from duel
        units.remove(units.get(UnitUtils.getRandomDuelistToRemove(units.size())));

        Unit firstDuelist = units.get(0);
        Unit secondDuelist = units.get(1);

        // Attacks of first duelist
        duelThread.scheduleAtFixedRate(() -> performAttack(firstDuelist, secondDuelist), firstDuelist.getAttackSpeed(), firstDuelist.getAttackSpeed(), TimeUnit.SECONDS);
        // Attack of second duelist
        duelThread.scheduleAtFixedRate(() -> performAttack(secondDuelist, firstDuelist), secondDuelist.getAttackSpeed(), secondDuelist.getAttackSpeed(), TimeUnit.SECONDS);
    }

    private static void performAttack(Unit attacker, Unit defender) {
        System.out.printf("%s (%.2f HP) attacks:%n", attacker.getClassName(), attacker.getHP());

        defender.absorbDamage(attacker.getDealtDamageValue());
        Double defenderHp = defender.getHP();

        if (defenderHp < 0.0) {
            System.out.printf("%s is winner!", attacker.getClassName());
            duelThread.shutdown();
        }

        if (defenderHp > 0.0) {
            System.out.printf("%s (%.2f HP).%n%n", defender.getClassName(), defender.getHP());
        }
    }
}
