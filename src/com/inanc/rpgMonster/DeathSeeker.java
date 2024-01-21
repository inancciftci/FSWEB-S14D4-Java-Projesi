package com.inanc.rpgMonster;

public class DeathSeeker extends Monster implements Bleedable, Poisonable{
    public DeathSeeker(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.35;
    }
}
