package com.company.javaRelearn.NIIT3.Week7;

import java.util.*;
import java.util.function.Function;

class WordCount {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}

class StudentScore {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentScores = new TreeMap<>();
        studentScores.put("Tom", 85);
        studentScores.put("Alice", 92);
        studentScores.put("Bob", 78);

        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }
    }
}

class Book {
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
}

class BookSort {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 50));
        books.add(new Book("Data Structures", 40));
        books.add(new Book("Algorithms", 60));

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.price, b2.price);
            }
        });

        for (Book book : books) {
            System.out.println(book.title + " - $" + book.price);
        }
    }
}

class LambdaSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 1, 8, 3);

        numbers.sort((a, b) -> a - b);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

interface StringLength {
    int getLength(String s);
}

class LambdaLength {
    public static void main(String[] args) {
        StringLength lengthFunction = s -> s.length();
        System.out.println(lengthFunction.getLength("Hello")); // 输出 5
        System.out.println(lengthFunction.getLength("Java Programming")); // 输出 16
    }
}

interface Calculator {
    int calculate(int a, int b);
}

class LambdaCalculator {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(5, 3)); // 输出 8
    }
}

class FunctionEvenCheck {
    public static void main(String[] args) {
        Function<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println(isEven.apply(4)); // 输出 true
        System.out.println(isEven.apply(7)); // 输出 false
    }
}

public class WeekEx7 {
}
