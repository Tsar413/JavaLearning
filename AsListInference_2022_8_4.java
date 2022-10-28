package com.company.javaRelearn;

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference_2022_8_4 {
    public static void main(String[] args) {
        ArrayList<Snow> snow1 = new ArrayList<Snow>();
        Collections.addAll(snow1, new Light(), new Heavy());
        List<Snow> snow2 = Arrays.asList(new Powder(), new Crusty(), new Slush());
//        List<Snow> snow3 = Arrays.asList(new Light(),new Heavy()); 无法编译
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
