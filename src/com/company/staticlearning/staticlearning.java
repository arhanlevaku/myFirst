package com.company.staticlearning;

class hondaCars {
    static  double price = 200.20;
    private int x=10;

    void display() {
        System.out.println("values are :" + x + " " + price);
    }

    public static double getPrice() {
        return price;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }

    public static void setPrice(double price) {
        hondaCars.price = price;
    }

}

abstract class cityPrice{

    String cityName;
    public cityPrice() {

    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public cityPrice(String cityName) {
        this.cityName = cityName;
    }
    abstract double returnCityPrice(String cityName);

    public void display() {
        System.out.println("Coming to CityPrice class");
    }

}

class staticlearning {

    public static void main(String... args) {
        System.out.println("Hello ");
        hondaCars c1 = new hondaCars() {
            public void returnCityPrice(double x) {
                x = 100.12;
                System.out.println("The tax rate is :" + x);
            }

        };

        c1.setX(50);
        System.out.println("Info about c1 :" + c1.getX() + ", " + c1.price + " tax rate :");
        c1.display();
        c1.setPrice(100.25);
        hondaCars c2 = new hondaCars();
        c2.display();

        cityPrice cp = new cityPrice("Delhi") {
            @Override
            public double returnCityPrice(String cityName) {
              /* if (cityName.equals("Delhi")) {
                    System.out.println("City is :" + cityName);
                } else {
                    System.out.println("Printing some city :" + cityName);
                } */

                switch (cityName) {
                    case "Delhi":
                        return 8.5;
                    case "Bombay":
                        return 9.5;
                    default:

                        return 1;

                }

            }
        };
        cp.display();
        System.out.println (" Tax rate for city" + cp.cityName + " " + "tax rate :" +  cp.returnCityPrice(cp.getCityName()));
        System.out.println (" Tax rate for city" +  " " + "tax rate :" +  cp.returnCityPrice(cp.getCityName()));
    }
}

