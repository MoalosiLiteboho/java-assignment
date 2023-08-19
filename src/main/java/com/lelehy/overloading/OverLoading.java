package com.lelehy.overloading;

public class OverLoading {
    // method overloading bellow
    public void whatICanEat() {
        System.out.println("I can eat nothing.");
    }

    public void whatICanEat(String food) {
        System.out.printf(
                "I can eat %s.%n",
                food
        );
    }

    public void whatICanEat(String foodOne, String foodTwo) {
        System.out.printf(
                "I can eat %s and %s.%n",
                foodOne,
                foodTwo
        );
    }
}
