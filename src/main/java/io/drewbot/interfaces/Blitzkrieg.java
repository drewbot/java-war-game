package io.drewbot.interfaces;

public interface Blitzkrieg extends Charge {

    public String lightningStrike();

    // Can be overwritten
    default String dropBombs() {
        return "bombs over bhagdad";
    }
}
