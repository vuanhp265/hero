package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();

        Hero heroNigger = new Hero();
        heroNigger.setName("Nigger");
        heroNigger.setHp(69);
        heroNigger.setDamage(4);
        heroList.add(heroNigger);

        Hero heroWoke = new Hero();
        heroWoke.setName("Woke");
        heroWoke.setHp(28);
        heroWoke.setDamage(10);
        heroList.add(heroWoke);

        for (var hero : heroList) {
            System.out.println(hero.getName());
            hero.attack();
            System.out.println(hero.getDamage());
            System.out.println(hero.getHp());
        }
    }
}