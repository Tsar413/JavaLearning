package com.company.javaRelearn;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow_2022_7_11 {
    public static void u(Monster b) {b.menace();}
    public static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    public static void w(Lethal l) {l.kill();}

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vampire = new VeryBadVampire();
        u(vampire);
        v(vampire);
        w(vampire);
    }
}
