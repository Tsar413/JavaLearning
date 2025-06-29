package com.company.javaRelearn.SEReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface InterfaceExample {
    abstract public void play(String n);
    String display();
}

abstract class AbstractClassExample {
    abstract public void play(String n);
    String display() {
        return "abstractClassExample";
    }
}

interface Music {
    public void play();
    public String what();
}

class AbstractClassBase extends AbstractClassExample {
    @Override
    public void play(String n) {
        System.out.println(n);
    }

    String display() {
        return "abstractClassBase";
    }
}

class InterfaceBase implements InterfaceExample {
    @Override
    public void play(String n) {
        System.out.println(n);
    }

    @Override
    public String display() {
        return "interfaceBase";
    }
}

class Piano implements Music {
    @Override
    public void play() {
        System.out.println("Piano");
    }

    @Override
    public String what() {
        return "Piano";
    }
}

class Violin implements Music {
    @Override
    public void play() {
        System.out.println("Violin");
    }

    @Override
    public String what() {
        return "Violin";
    }
}

class ListMusic {
    List<Music> musicList = new ArrayList<Music>();
    List<Violin> violinList = new ArrayList<Violin>();

    public <T> void makeMusicList(List<? super T> data, T m) {
        data.add(m);
    }

    public void f() {
        makeMusicList(musicList, new Violin());
        makeMusicList(musicList, new Piano());
        makeMusicList(violinList, new Violin());
    }

    void testMakeMusicList() {
        List<Music> musicList1 = new ArrayList<Music>();
        List<Music> testData = Arrays.asList(new Violin(), new Violin(), new Piano());

        for (Music m : testData) {
            makeMusicList(musicList1, m);
        }

        for (Music m : musicList1) {
            System.out.println(m.what());
        }
        
    }
}

class FinalExample {
    public final int SIZE = 6;

    public final String printSomething() {
        return "FinalExample";
    }
}

public class AdvancedOOPExample {

}
