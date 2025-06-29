package com.company.javaRelearn.AdvancedProgrammingAE1;

public interface Component {
    public String getName();
    public int getSize();
    public int getCount();
    public String display(String prefix);
    public Component search(String name);
}
