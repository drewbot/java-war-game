package io.drewbot;

import io.drewbot.abstracts.Soldier;
import io.drewbot.models.Army;
import io.drewbot.models.Assassin;
import io.drewbot.models.Marines;
import io.drewbot.models.Navy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the soldier game");

        Marines grunt = new Marines();
        createSoldier(grunt, "Forest Gump", "Sergeant", 1234567);
        identifySelf(grunt);

        Army ranger = new Army();
        createSoldier(ranger, "Gomer Pile", "Private", 2345678);
        identifySelf(ranger);

        Navy merman = new Navy();
        createSoldier(merman, "Elvis Presley", "Leiutenant", 3456789);
        identifySelf(merman);

        System.out.println(grunt.speak());
        System.out.println(grunt.run());
        System.out.println(grunt.attack());
        System.out.println(grunt.block());

        Assassin shinobi = new Assassin();
        System.out.println(shinobi.lightningStrike());
        System.out.println(shinobi.dropBombs());

    }

    public static void createSoldier(Soldier mySoldier, String name, String rank, int serialNumber) {
        mySoldier.setName(name).setRank(rank).setSerialNumber(serialNumber);
    }

    public static void identifySelf(Soldier mySoldier) {
        String name = mySoldier.getName();
        String rank = mySoldier.getRank();
        int serialNumber = mySoldier.getSerialNumber();
        System.out.println(rank + " " + name + ", reporting for duty, sir! " + "Serial Number " + serialNumber + ", sir!");
    }



}
