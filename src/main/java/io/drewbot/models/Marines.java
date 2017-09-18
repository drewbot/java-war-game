package io.drewbot.models;

import io.drewbot.abstracts.Soldier;
import io.drewbot.interfaces.Charge;

public class Marines extends Soldier implements Charge {


    public String speak() {
        return "Oohrah";
    }

    public String run() {
        return "boots on the ground";
    }

    public String attack() {
        return "Blast em";
    }

    public String block() {
        return "Take cover";
    }
}
