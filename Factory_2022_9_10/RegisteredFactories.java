package com.company.javaRelearn.Factory_2022_9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();
    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new PowderSteeringBelt.Factory());
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowderSteeringBelt extends Belt {
    public static class Factory implements com.company.javaRelearn.Factory_2022_9_10.Factory<PowderSteeringBelt> {
        @Override
        public PowderSteeringBelt create() {
            return new PowderSteeringBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
