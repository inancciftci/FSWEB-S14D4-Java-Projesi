package com.inanc.rpgMonster;

public class Main {
    public static void main(String[] args) {
        Monster trollWarrior = new TrollWarrior("Warrior of Death", 400, 15);
        Monster deathSeeker = new DeathSeeker("Seeker of Death", 1000, 100);
        printResult(trollWarrior);
        printResult(deathSeeker);
    }

    private static void printResult(Monster monster){
        System.out.println("Attack of the " + monster.getName() + " dealt: " + monster.attack());
    }
}
