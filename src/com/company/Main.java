
package com.company;

public class Main {
    public static String option = "Можете идти гулять";
    public static String option1 = "Оставайтесь дома";

    public static void main(String[] args) {
        System.out.println(Pogoda(35, 27));
        System.out.println(Pogoda(18, 25));
        System.out.println(Pogoda(46, 20));
        System.out.println(Pogoda(24, 22));
        System.out.println(Pogoda(39, 20));
    }

    public static String Pogoda(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return option;
        } else if (age < 20 && temperature > 0 && temperature > 28) {
            return option;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return option;

        } else {
            return option1;
        }
    }
}