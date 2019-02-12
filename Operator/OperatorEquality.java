package com.gedharizka.javafundamental.Operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 3;
        boolean hasil ;
        hasil = value1==value2;
        System.out.println("Hasil 'value 1 == value 2' adalah " +hasil);
        System.out.println("====================================");
        System.out.println();

        System.out.println("Tidak sama dengan");
        hasil = value1 != value2;
        System.out.println("Hasil 'value 1 != value 2' adalah "+ hasil);
        System.out.println("====================================");
        System.out.println();

        System.out.println("lebih besar dari..");
        hasil = value1 > value2;
        System.out.println("Hasil 'value 1 > value 2' adalah " +hasil);
        System.out.println("====================================");
        System.out.println();


        System.out.println("Sama atau lebih besar dari");
        hasil = value1 >= value2;
        System.out.println("Hasil 'value 1 >= value 2' adalah " +hasil);
        System.out.println("====================================");
        System.out.println();

        System.out.println("kurang kecil dari..");
        hasil = value1 < value2;
        System.out.println("Hasil 'value 1 < value 2' adalah " +hasil);
        System.out.println("Sama atau lebih besar dari");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Sama atau lebih kecil dari");
        hasil = value1 <= value2;
        System.out.println("Hasil 'value 1 <= value 2' adalah " +hasil);
        System.out.println("====================================");
        System.out.println();
    }
}
