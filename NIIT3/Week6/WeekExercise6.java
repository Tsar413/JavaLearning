package com.company.javaRelearn.NIIT3.Week6;

import java.util.*;

/*
* 题目 1：泛型方法的使用
* 题目： 编写一个泛型方法 printArray，可以打印任意类型的数组元素。
* */
class GenericMethodExample {
    // 定义泛型方法
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Python", "C++"};

        printArray(intArray);
        printArray(strArray);
    }
}

/*
* 题目 2：泛型类
* 题目： 创建一个泛型类 Box，可以存储任意类型的数据，并提供 get 和 set 方法。
* */
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer Box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String Box: " + strBox.get());
    }
}

/*
* 题目 3：ArrayList 基础
* 题目： 创建一个 ArrayList<String>，添加 3 个水果名称，并遍历输出。
* */
class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("橙子");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

/*
* 题目 4：使用 List 进行排序
* 题目： 创建一个 ArrayList<Integer>，添加一些整数，并按升序排序。
* */
class ListSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        Collections.sort(numbers);
        System.out.println("排序后的列表：" + numbers);
    }
}

/*
* 题目 5：HashSet 基础
* 题目： 创建一个 HashSet 存储城市名称，并遍历输出。
* */
class SetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("北京"); // 这个重复项不会被添加

        for (String city : cities) {
            System.out.println(city);
        }
    }
}

/*
* 题目 6：TreeSet 排序
* 题目： 创建一个 TreeSet<Integer> 存储整数，并自动排序。
* */
class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);

        System.out.println("排序后的 TreeSet：" + numbers);
    }
}

/*
* 题目 7：List 转换为 Set
* 题目： 通过 ArrayList 添加重复元素，然后转换为 HashSet 去重。
* */
class ListToSetExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // 重复数据

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("去重后的集合：" + uniqueNames);
    }
}

/*
* 题目 8：遍历 Set
* 题目： 使用 Iterator 遍历 HashSet。
* */
class SetIteratorExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("苹果");
        set.add("香蕉");
        set.add("橙子");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

/*
* 题目 9：使用 List 存储对象
* 题目： 创建 Student 类，并使用 ArrayList 存储多个学生信息。
* */
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}

class StudentListExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18));
        students.add(new Student("小红", 19));

        for (Student student : students) {
            student.showInfo();
        }
    }
}

/*
* 题目 10：泛型通配符
* 题目： 编写一个方法，支持打印 List 的任意类型数据。
* */
class WildcardExample {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "C");

        printList(numbers);
        printList(words);
    }
}

/*
* 1472. 设计浏览器历史记录
你有一个只支持单个标签页的 浏览器 ，最开始你浏览的网页是 homepage ，你可以访问其他的网站 url ，也可以在浏览历史中后退 steps 步或前进 steps 步。

请你实现 BrowserHistory 类：

BrowserHistory(string homepage) ，用 homepage 初始化浏览器类。
void visit(string url) 从当前页跳转访问 url 对应的页面  。执行此操作会把浏览历史前进的记录全部删除。
string back(int steps) 在浏览历史中后退 steps 步。如果你只能在浏览历史中后退至多 x 步且 steps > x ，那么你只后退 x 步。请返回后退 至多 steps 步以后的 url 。
string forward(int steps) 在浏览历史中前进 steps 步。如果你只能在浏览历史中前进至多 x 步且 steps > x ，那么你只前进 x 步。请返回前进 至多 steps步以后的 url 。


示例：

输入：
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
输出：
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]

解释：
BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
browserHistory.visit("google.com");       // 你原本在浏览 "leetcode.com" 。访问 "google.com"
browserHistory.visit("facebook.com");     // 你原本在浏览 "google.com" 。访问 "facebook.com"
browserHistory.visit("youtube.com");      // 你原本在浏览 "facebook.com" 。访问 "youtube.com"
browserHistory.back(1);                   // 你原本在浏览 "youtube.com" ，后退到 "facebook.com" 并返回 "facebook.com"
browserHistory.back(1);                   // 你原本在浏览 "facebook.com" ，后退到 "google.com" 并返回 "google.com"
browserHistory.forward(1);                // 你原本在浏览 "google.com" ，前进到 "facebook.com" 并返回 "facebook.com"
browserHistory.visit("linkedin.com");     // 你原本在浏览 "facebook.com" 。 访问 "linkedin.com"
browserHistory.forward(2);                // 你原本在浏览 "linkedin.com" ，你无法前进任何步数。
browserHistory.back(2);                   // 你原本在浏览 "linkedin.com" ，后退两步依次先到 "facebook.com" ，然后到 "google.com" ，并返回 "google.com"
browserHistory.back(7);                   // 你原本在浏览 "google.com"， 你只能后退一步到 "leetcode.com" ，并返回 "leetcode.com"


提示：

1 <= homepage.length <= 20
1 <= url.length <= 20
1 <= steps <= 100
homepage 和 url 都只包含 '.' 或者小写英文字母。
最多调用 5000 次 visit， back 和 forward 函数。
* */
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

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

public class WeekExercise6 {
}
