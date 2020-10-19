package com.konversisuhu;

import java.util.Scanner;

public class konversisuhu {
    static double suhu;
    static char awal;

    public static void main(String[] args) {
        celcius fromcelcius = new celcius();
        fahrenheit fromfahrenheit = new fahrenheit();
        reamur fromreamur = new reamur();
        kelvin fromkelvin = new kelvin();
        boolean valid = false;
        Scanner a = new Scanner(System.in);

        while(!valid) {
            double Fahrenheit, Kelvin, Reamur, Celcius;
            System.out.println("Program Konversi Suhu");
            System.out.print("Masukkan Suhu [C/F/R/K] (Misal: 100 R): ");
            suhu = a.nextDouble();
            awal = a.next().charAt(0);

            switch (awal) {
                case 'C':
                    Reamur = fromcelcius.toreamur();
                    Fahrenheit = fromcelcius.tofahrenheit();
                    Kelvin = fromcelcius.tokelvin();
                    System.out.println("Suhu = " + suhu + " Celcius");
                    System.out.println("Fahrenheit = " + Fahrenheit + " Derajat");
                    System.out.println("Kelvin = " + Kelvin + " Kelvin");
                    System.out.println("Reamur = " + Reamur + " Derajat");
                    valid = true;
                    break;
                case 'F':
                    Celcius = fromfahrenheit.tocelcius();
                    Reamur = fromfahrenheit.toreamur();
                    Kelvin = fromfahrenheit.tokelvin();
                    System.out.println("Suhu =" + suhu + " Fahrenheit");
                    System.out.println("Celcius = " + Celcius + " Derajat");
                    System.out.println("Kelvin = " + Kelvin + " Kelvin");
                    System.out.println("Reamur = " + Reamur + " Derajat");
                    valid = true;
                    break;
                case 'K':
                    Celcius = fromkelvin.tocelcius();
                    Reamur = fromkelvin.toreamur();
                    Fahrenheit = fromkelvin.tofahrenheit();
                    System.out.println("Suhu =" + suhu + " Kelvin");
                    System.out.println("Celcius = " + Celcius + " Derajat");
                    System.out.println("Fahrenheit = " + Fahrenheit + " Derajat");
                    System.out.println("Reamur = " + Reamur + " Derajat");
                    valid = true;
                    break;
                case 'R':
                    Celcius = fromreamur.tocelcius();
                    Fahrenheit = fromreamur.tofahrenheit();
                    Kelvin = fromreamur.tokelvin();
                    System.out.println("Suhu =" + suhu + " Reamur");
                    System.out.println("Celcius = " + Celcius + " Derajat");
                    System.out.println("Fahrenheit = " + Fahrenheit + " Derajat");
                    System.out.println("Kelvin = " + Kelvin + " Kelvin");
                    valid = true;
                    break;
                default:
                    System.out.println("Masukkan Suhu Dengan Benar [C,F,K,R]");
            }
        }
    }
}
