package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    private List<String> list;
    private int index;

    public BrowserHistory(String homepage) {
        this.list = new ArrayList<String>();
        this.list.add(homepage);
        this.index = 0;
    }

    public void visit(String url) {
        int step = 0;
        int size = list.size() - 1;
        while (step < size - index){
            list.remove(list.size() - 1);
            step++;
        }
        this.list.add(url);
        this.index = this.list.size() - 1;
    }

    public String back(int steps) {
        if(steps > index){
            this.index = 0;
            return list.get(0);
        }
        this.index = index - steps;
        return list.get(index);
    }

    public String forward(int steps) {
        if(this.index + steps >= this.list.size()){
            this.index = this.list.size() - 1;
            return list.get(index);
        }
        this.index += steps;
        return list.get(index);
    }
}

public class BrowserHistory_20250226 {
}
