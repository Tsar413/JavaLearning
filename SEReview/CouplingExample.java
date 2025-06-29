package com.company.javaRelearn.SEReview;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    public int age;

    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ContentCoupling {
    public User findUser() {
        User result = new User();
        return result;
    }

    public void addAge() {
        User user1 = findUser();
        user1.age ++;
    }
}

class CommonCoupling {
    User user1 = new User();

    public void changeUsername(String newUsername) {
        user1.setName(newUsername);
    }

    public void changeUserAge(int age) {
        user1.age = age;
    }

    public void addUserAge() {
        user1.age++;
    }
}

class ControlCoupling {
    User user1 = new User();

    public boolean filtering(boolean ageSituation) {
        boolean result = false;
        if (ageSituation) {
            if (user1.age > 18) {
                result = true;
            }
        }
        return result;
    }
}

class StampCoupling {
    List<User> data = new ArrayList<User>();

    public void addAge() {
        for (User datum : data) {
            datum.age++;
        }
    }
}

class DataCoupling {
    List<User> data1 = new ArrayList<User>();
    List<User> data2 = new ArrayList<User>();

    public String printUser(List<User> data) {
        String output = "";
        for (User user : data) {
            output += user;
        }
        return output;
    }

    public int addAge(int age1, int age2) {
        return age1 + age2;
    }
}

class RoutineCoupling {
    public String start() throws Exception {
        BufferedReader b = new BufferedReader(
                new InputStreamReader(System.in));
        String result = "";
        String s = "";
        while ((s = b.readLine()) != null && s.length() != 0) {
            result += s;
            result += "|";
        }
        return result;
    }

    public boolean end(String data) throws Exception {
        DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(data)));
        return true;
    }
}

public class CouplingExample {

}
