package part_six.entities;

import part_six.utils.UnitUtils;

public class Warrior extends Unit {

    public Warrior(String className, Double hp, Double minDamage, Double maxDamage, Long attackSpeed) {
        this.className = className;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public Double getHP() {
        return hp;
    }

    @Override
    public void absorbDamage(Double damage) {
        hp -= damage;
    }

    @Override
    public Double getDealtDamageValue() {
        return minDamage + (maxDamage - minDamage) * UnitUtils.getRandomDamageMultiplier();
    }

    @Override
    public Long getAttackSpeed() {
        return attackSpeed;
    }

    @Override
    public String getClassName() {
        return className;
    }
}
