package org.example;

import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {

        String produtct1 = "Computer";
        String produtct2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n%s, which price $ %.2f %n",produtct1, price1, produtct2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s %n", age, code, gender);
        System.out.printf("%nMeasue with eight decimal places: %.6f %nRouded (three decimal places): %.3f %n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decima point: %.3f", measure);
    }
}
