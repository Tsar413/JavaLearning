package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision_20241101 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < asteroids.length; i++){
            if(stack.empty()){
                stack.push(asteroids[i]);
            } else {
                while (!stack.empty()){
                    if(stack.peek() >= 0 && asteroids[i] >= 0 || stack.peek() < 0 && asteroids[i] < 0){
                        stack.push(asteroids[i]);
                        break;
                    } else if(stack.peek() < 0 && asteroids[i] >= 0){
                        stack.push(asteroids[i]);
                        break;
                    } else if(stack.peek() >= 0 && asteroids[i] < 0) {
                        if(Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                            stack.pop();
                        } else if(Math.abs(stack.peek()) == Math.abs(asteroids[i])){
                            stack.pop();
                            //i++;
                            break;
                        } else {
                            break;
                        }
                    }
                }
            }
            if(stack.empty()){
                stack.push(asteroids[i]);
            }
        }
        int[] temp = new int[stack.size()];
        for (int i = temp.length - 1; i >= 0; i--) {
            temp[i] = stack.pop();
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] asteroids = {1, -2, -2, -2};
        System.out.println(Arrays.toString(new AsteroidCollision_20241101().asteroidCollision(asteroids)));
    }
}
