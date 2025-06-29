package com.company.javaRelearn.AdvancedProgrammingAE1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String directoryName;
    private int directorySize;
    private int directoryCount;
    private List<Component> list;
    private static int temp = 0;

    public Directory() {}

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        list = new ArrayList<Component>();
    }

    public List<Component> getList() {
        return list;
    }

    public String getDirectoryName() {
        return directoryName;
    }
    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public int getDirectorySize() {
        return directorySize;
    }
    public void setDirectorySize(int directorySize) {
        this.directorySize = directorySize;
    }

    public int getDirectoryCount() {
        return directoryCount;
    }
    public void setDirectoryCount(int directoryCount) {
        this.directoryCount = directoryCount;
    }

    public void add(Component component) {
        list.add(component);
//        directorySize += component.getSize();
//        directoryCount += component.getCount();
    }

    public void remove(Component component) {
        list.remove(component);
//        directorySize -= component.getSize();
//        directoryCount -= component.getCount();
    }

    @Override
    public String getName() {
        return directoryName;
    }

    @Override
    public int getSize() {
        directorySize = 0;
        for (Component component : this.list) {
            directorySize += component.getSize();
        }
        return directorySize;
    }

    @Override
    public int getCount() {
        directoryCount = 0;
        for (Component component : this.list) {
            directoryCount += component.getCount();
        }
        return directoryCount;
    }

    @Override
    public String display(String prefix) {
        StringBuilder result = new StringBuilder();
        result.append(this.getName());
        result.append(": (count=");
        result.append(this.getCount());
        result.append(",size=");
        result.append(this.getSize());
        result.append(")");
        result.append("\n");
        for (Component component : list) {
            if (component.getClass().getSimpleName().equals("File")) {
                for (int i = 0; i <= temp; i++) {
                    result.append(prefix);
                }
                result.append(component.getName());
                result.append(" (");
                result.append(component.getSize());
                result.append(")");
                result.append("\n");
            } else {
                temp++;
                for (int i = 0; i < temp; i++) {
                    result.append(prefix);
                }
                result.append(component.display(prefix));
                temp--;
            }
        }
        if (temp == 0) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    @Override
    public Component search(String name) {
//        Component componentResult = new Component() {
//            @Override
//            public String getName() {
//                return null;
//            }
//
//            @Override
//            public int getSize() {
//                return 0;
//            }
//
//            @Override
//            public int getCount() {
//                return 0;
//            }
//
//            @Override
//            public String display(String prefix) {
//                return null;
//            }
//
//            @Override
//            public Component search(String name) {
//                return null;
//            }
//        };

        for (Component component : list) {
            if (component.getName().equals(name)) {
//                componentResult = this;
//                break;
                return this;
            } else {
                if (component.getClass().getSimpleName().equals("Directory")) {
//                    componentResult = component.search(name);
//                    if (componentResult != null) {
//                        break;
//                    }

                    if (component.search(name) != null) {
                        return component.search(name);
                    }
                }
            }
        }
//        return componentResult;
        return null;
    }
}
