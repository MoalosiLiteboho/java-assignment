package com.lelehy.inheritance;

public class Parent {
    protected String name;
    protected String surname;
    protected String skinColor;

    public Parent(String name, String surname, String skinColor) {
        this.name = name;
        this.surname = surname;
        this.skinColor = skinColor;
    }

    public void displayMyFields() {
        System.out.printf(
                "I am %s %s and I have %s skin color.%n",
                name,
                surname,
                skinColor
        );
    }
}
