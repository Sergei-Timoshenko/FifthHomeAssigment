package part_six.entities;

public abstract class Unit {
    protected String className;
    protected Double hp;
    protected Double minDamage;
    protected Double maxDamage;
    protected Long attackSpeed;

    public abstract Double getHP();

    public abstract void absorbDamage(Double damage);

    public abstract Double getDealtDamageValue();

    public abstract Long getAttackSpeed();

    public abstract String getClassName();
}
