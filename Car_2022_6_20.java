package com.company.javaRelearn;

class Service {
    int music;
    double radio;
    Service() {}
    Service(int music, double radio) {
        super();
        this.music = music;
        this.radio = radio;
    }

    public int getMusic() {
        return music;
    }
    public void setMusic(int music) {
        this.music = music;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Service{" +
                "music=" + music +
                ", radio=" + radio +
                '}';
    }
}

class Engine {
    public void start() {}
    public void end() {}
    public void rev() {}
    public void service() {}
    public void service(int music, double radio) {
        System.out.println(music + " " + radio);
    }
}

class Wheel {
    public void inflate(int psi) {}
}

class Window2 {
    public void rollUp() {}
    public void rollDown() {}
}

class Door {
    Window2 window = new Window2();
    public void open() {}
    public void close() {}
}

public class Car_2022_6_20 {
    Engine engine = new Engine();
    Service service = new Service();
    Wheel[] wheel = new Wheel[4];
    Door left = new Door();
    Door right = new Door();
    Car_2022_6_20() {
        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car_2022_6_20 car = new Car_2022_6_20();
        car.left.close();
        car.left.window.rollDown();
        car.engine.start();
        car.service.setMusic(1);
        car.service.setRadio(89.4);
        System.out.println(car.service);
        car.engine.service(2,76.8);
    }
}
