package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class PetMap_2022_8_11 {
    public class Pet {
        public class Cat extends Pet {
            String catName;
            Cat() {}
            Cat(String catName) {
                super();
                this.catName = catName;
            }
        }
        public class Dog extends Pet {
            String dogName;
            Dog() {}
            Dog(String dogName) {
                super();
                this.dogName = dogName;
            }
        }
        public class Hamster extends Pet {
            String hamsterName;
            Hamster() {}
            Hamster(String hamsterName) {
                super();
                this.hamsterName = hamsterName;
            }
        }
    }

    public static void main(String[] args) {
        PetMap_2022_8_11 pet = new PetMap_2022_8_11();
        PetMap_2022_8_11.Pet pet1 = pet.new Pet();
        Map<String, PetMap_2022_8_11.Pet> map = new HashMap<String, PetMap_2022_8_11.Pet>();
        map.put("My Cat",pet1.new Cat("Molly"));
        map.put("My Dog",pet1.new Dog("Ginger"));
        map.put("My Hamster", pet1.new Hamster("Bosco"));
        System.out.println(map);
        Pet dog = map.get("My Dog");
        System.out.println(dog);
        System.out.println(map.containsKey("My Dog"));
        System.out.println(map.containsValue(dog));
    }
}
