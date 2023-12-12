package com.javaprogram;

import java.util.Scanner;

public class Kalkulator {

    double nilaiA,nilaiB,hasil;
    Scanner inputUser = new Scanner(System.in);
    public String penjumlahan(){
        System.out.println("\nInput nilai A : ");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B : ");
        nilaiB = inputUser.nextInt();
        hasil = nilaiA + nilaiB;
        System.out.printf("Hasil %.0f + %.0f = %.2f \n",nilaiA,nilaiB,hasil);
        return "Berhasil";
    }

    public String pengurangan(){
        System.out.println("\nInput nilai A : ");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B : ");
        nilaiB = inputUser.nextInt();
        hasil = nilaiA - nilaiB;
        System.out.printf("Hasil %.0f - %.0f = %.2f \n",nilaiA,nilaiB,hasil);
        return "Berhasil";
    }

    public String perkalian(){
        System.out.println("\nInput nilai A : ");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B : ");
        nilaiB = inputUser.nextInt();
        hasil = nilaiA * nilaiB;
        System.out.printf("Hasil %.0f x %.0f = %.2f \n",nilaiA,nilaiB,hasil);
        return "Berhasil";
    }

    public String pembagian(){
        System.out.println("\nInput nilai A : ");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B : ");
        nilaiB = inputUser.nextInt();
        hasil = nilaiA / nilaiB;
        System.out.printf("Hasil %.0f / %.0f = %.2f \n",nilaiA,nilaiB,hasil);
        return "Berhasil";
    }

    public String modulus(){
        System.out.println("\nInput nilai A : ");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B : ");
        nilaiB = inputUser.nextInt();
        hasil = nilaiA % nilaiB;
        System.out.printf("Hasil %.0f mod %.0f = %.2f \n",nilaiA,nilaiB,hasil);
        return "Berhasil";
    }

}
