package com.lelehy.inheritance;

// the keyword used to inheritance is 'extends'
public class Child extends Parent{
    private final boolean canWalk;

    public Child(String name, String surname, String skinColor, boolean canWalk) {
        // the use of 'super' word to use parent class constructor
        super(name, surname, skinColor);
        this.canWalk = canWalk;
    }

    @Override
    public void displayMyFields() {
        // use of super to use parent method in the child
        super.displayMyFields();
        System.out.println(
                canWalk ?
                        "Also I can walk." :
                        "Also I can not walk."
        );
    }
}
