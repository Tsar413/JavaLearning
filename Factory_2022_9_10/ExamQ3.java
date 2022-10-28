package com.company.javaRelearn.Factory_2022_9_10;

public class ExamQ3 {
    private int a;
 public ExamQ3(int b) {
         a = b;
         }
 private int getA() {
         return a;
         }
 private void setA(int b) {
         a = b;
         }
 public String toString() {
        return "" + a;
        }
public static void add3(int a) {
        a += 3;
        }
public static void add3Obj(ExamQ3 e) {
        e.setA(3 + e.getA());
        }
public static void main(String[] args) {
        int a = 5;
        ExamQ3 ee = new ExamQ3(a);
        add3(a);
        ee.getA();
        System.out.println(a);
        add3Obj(ee);
        System.out.println(ee.getA());
        }

}
