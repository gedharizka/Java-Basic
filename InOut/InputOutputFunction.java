package com.gedharizka.javafundamental.InOut;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sederhana");

        System.out.println("Masukan Angka Pertama : ");
        int value1 = scanner.nextInt();

        System.out.println("Masukan Angka Kedua :");
        int valuel2 = scanner.nextInt();

        int hasil = value1+valuel2;

        System.out.println("Hasilnya adalah : " + hasil);
    }
}
