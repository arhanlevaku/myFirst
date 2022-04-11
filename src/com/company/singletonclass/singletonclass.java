package com.company.singletonclass;

class coffeemachine {
    private int coffeeQty;
    private int waterQty;
    private static coffeemachine cofmac = null;
    private static coffeemachine cofmac1 = null;
    private static int numberOfSingleton = 0;


    private coffeemachine() {
        coffeeQty = 1;
        waterQty = 1;
    }

    public int getCoffeeQty() {
        return coffeeQty;
    }

    public void setCoffeeQty(int coffeeQty) {
        this.coffeeQty = coffeeQty;
    }

    public int getWaterQty() {
        return waterQty;
    }

    public void setWaterQty(int waterQty) {
        this.waterQty = waterQty;
    }

    static coffeemachine getInstance() {
        if (cofmac == null || numberOfSingleton <2) {
            cofmac = new coffeemachine();
            numberOfSingleton++;
        }
        return cofmac;
    }
}

public class singletonclass {
    public static void main (String...args) {
        System.out.println("Hello");
        coffeemachine cf = coffeemachine.getInstance();
        cf.setCoffeeQty(3);
        System.out.println(" coffee quantity :" + cf.getCoffeeQty());
        coffeemachine cf1 = coffeemachine.getInstance();
        coffeemachine cf2 = coffeemachine.getInstance();
        System.out.println("cf :" + cf + "cf1 :" + cf1);

        if (cf2==cf || cf2==cf1 || cf==cf1) {
            System.out.println("they are same objects");
        }
    }
}
