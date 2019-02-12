package com.gedharizka.javafundamental.InOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program Penjumlahan Sederhana");

        int value1 = 0;
        int value2 = 0;

        try {
            System.out.println("Masukan Angka Pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan Angka Kedua :");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        int hasil = value1+value2;
        System.out.println("Hasilnya adalah :" + hasil);
    }
}
