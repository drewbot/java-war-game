package io.drewbot.models;

import io.drewbot.abstracts.Soldier;
import io.drewbot.interfaces.Blitzkrieg;

public class Assassin extends Soldier implements Blitzkrieg {
    public String speak() {
        return null;
    }

    public String lightningStrike() {
        return "Silent but deadly";
    }

    public String dropBombs() {
        return "bombs over Bowser's castle";
    }

    public String run() {
        return null;
    }

    public String attack() {
        return null;
    }

    public String block() {
        return null;
    }
}
