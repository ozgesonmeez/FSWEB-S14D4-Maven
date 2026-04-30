package org.example.rpg;

public class Werewolf extends Monster {

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    protected double bleed() {
        return 0;
    }

    @Override
    public double attack() {

        return getDamage();
    }

    public void showDetails() {
        System.out.println("=== Werewolf ===");
        System.out.println("Name: " + getName());
        System.out.println("Hit Points: " + getHitPoints());
        System.out.println("Damage: " + getDamage());
    }
}