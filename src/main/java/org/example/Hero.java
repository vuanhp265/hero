package org.example;

public class Hero extends Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double hp;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    private double damage;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    void attack() {
        System.out.println("hero attack with "+ damage);
    }

    @Override
    void run() {

    }

    @Override
    void jump() {

    }
}
