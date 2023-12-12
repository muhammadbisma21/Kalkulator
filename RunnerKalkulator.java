package com.javaprogram;

import java.util.Scanner;

public class RunnerKalkulator extends Kalkulator {

    public static void main(String[] args) {

        String input;
        double nilaiA,nilaiB,hasil;
        Scanner inputMenu = new Scanner(System.in);

        System.out.println("pilih operasi bilangan \n" +
                "1. Penjumlahan\n" +
                "2. Pengurangan\n" +
                "3. Perkalian\n" +
                "4. Pembagian\n" +
                "5. Hasil Bagi (modulus)\n\n");
        System.out.printf("Pilih nomor = ");
        input = inputMenu.next();

        Kalkulator kalkulator = new Kalkulator();
        Scanner inputUser = new Scanner(System.in);
        switch (input){
            case "1":
                System.out.println(kalkulator.penjumlahan());
                break;
            case "2":
                System.out.println(kalkulator.pengurangan());
                break;
            case "3":
                System.out.println(kalkulator.perkalian());
                break;
            case "4":
                System.out.println(kalkulator.pembagian());
                break;
            case "5":
                System.out.println(kalkulator.modulus());
                break;
            default:
                System.out.println("Gagal, Pilih nomor 1-5");
        }
    }
}
