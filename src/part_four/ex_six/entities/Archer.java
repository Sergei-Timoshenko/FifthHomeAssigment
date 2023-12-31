package part_four.ex_six.entities;


import part_four.ex_six.utils.UnitUtils;

public class Archer extends Unit {

    public Archer(String className, Double hp, Double minDamage, Double maxDamage, Long attackSpeed) {
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
