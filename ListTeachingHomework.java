package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

class Citizen{
    private int id;
    private String name;
    private int countryId;
    private String nationality;

    public Citizen(){

    }

    public Citizen(int id, String name, int countryId, String nationality) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

public class ListTeachingHomework {
    public static void main(String[] args) {
//        请在这里开始编码
//        任务1：初始化数据类型为Citizen的数组
        List<Citizen> citizens = new ArrayList<Citizen>();

//        任务2：在任务1中创建的数组按照person1, person2, person3, person4的顺序添加。要求id自增。
        Citizen person1 = new Citizen(1, "LI HUA", 86, "Chinese");
        Citizen person2 = new Citizen(3, "Joseph Magurie", 44, "British");
        Citizen person3 = new Citizen(2, "Blair Archibald", 47, "Norwegian");
        Citizen person4 = new Citizen(4, "Chris Anagnostopoulos", 30, "Greek");
        citizens.add(person1);
        citizens.add(person2);
        citizens.add(1, person3);
        citizens.add(person4);

//        任务3：从list中获取并修改person2的name为：Joseph Maguire，修改后重新存储。
        Citizen citizenTemp = citizens.get(2);
        citizenTemp.setName("Joseph Maguire");
        citizens.set(2, citizenTemp);
        //citizens.get(2).setName("Joseph Maguire");

//        任务4：删除索引为3的数据
        citizens.remove(3);

//        任务5：通过print查看结果
        System.out.println(citizens);

    }
}
