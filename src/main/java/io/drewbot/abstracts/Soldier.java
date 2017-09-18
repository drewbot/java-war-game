package io.drewbot.abstracts;

public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;

    public String getName() {
        return name;
    }

    public Soldier setName(String name) {
        this.name = name;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public Soldier setRank(String rank) {
        this.rank = rank;
        return this;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Soldier setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String sleep() {
        return "snore";
    }

    public String eat() {
        return "chew";
    }

    public String walk() {
        return "trudge";
    }

    public abstract String speak();
}
