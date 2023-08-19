package com.lelehy;

import com.lelehy.inheritance.Child;
import com.lelehy.inheritance.Parent;
import com.lelehy.overloading.OverLoading;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Liteboho", "Tsosane", "black");
        Child child = new Child("Katleho", "Lethola", "white", true);
        OverLoading overLoading = new OverLoading();

        // Parent
        System.out.println("\nUsing Parent method To display Parent fields:");
        parent.displayMyFields();

        // child
        System.out.println("\nUsing Parent method To display Child fields:");
        child.displayMyFields();

        // method overloading
        System.out.println("\nUsing Overloading to show how method overloading is don eadn used:");
        overLoading.whatICanEat();
        overLoading.whatICanEat("Hlatswane");
        overLoading.whatICanEat("Papa", "Nama");
    }
}
