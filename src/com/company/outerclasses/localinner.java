package com.company.outerclasses;

class outer {
    public void display() {
        class inner {
            public void show() {
                System.out.println("Hello Inner class");
            }
        }
        new inner().show();
    }

}

public class localinner {
    public static void main (String...args) {
        System.out.println("Hello outerclass");
        outer o = new outer();
        o.display();
    }
}