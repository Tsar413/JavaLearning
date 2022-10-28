package com.company.javaRelearn;

import java.util.List;

interface SuperPower {}

interface XRayVersion extends SuperPower {
    void seeThroughWalls();
}

interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}

interface SuperSmell extends SuperPower {
    void trackBySmell();
}

class SuperHero<Power extends SuperPower> {
    Power power;
    SuperHero(Power power) {
        this.power = power;
    }
    Power getPower() {
        return power;
    }
}

class SuperSleuth<Power extends XRayVersion> extends SuperHero<Power> {
    SuperSleuth(Power power) {
        super(power);
    }
    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<Power extends SuperHearing & SuperSmell> extends SuperHero<Power> {
    CanineHero(Power power) {
        super(power);
    }
    void hear() {
        power.hearSubtleNoises();
    }
    void smell() {
        power.trackBySmell();
    }
}

class SuperHearSmell implements SuperHearing, SuperSmell {
    public void hearSubtleNoises() {}

    @Override
    public void trackBySmell() {

    }
}

class DogBoy extends CanineHero<SuperHearSmell> {
    DogBoy() {
        super(new SuperHearSmell());
    }
}

public class EpicBattle_2022_10_26 {
    static <Power extends SuperHearing>
    void useSuperHearing(SuperHero<Power> hero) {
        hero.getPower().hearSubtleNoises();
    }
    static <Power extends SuperHearing & SuperSmell>
    void superFind(SuperHero<Power> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        List<? extends SuperHearing> audioBoys;
    }
}
