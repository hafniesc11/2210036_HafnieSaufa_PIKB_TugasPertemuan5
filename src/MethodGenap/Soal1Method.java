/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Method Genap : 
1. Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang menerima
masukan berupa 3 buah integer, periksa apakah masukan adalah ribuan.
*/

package MethodGenap;

import java.util.Scanner;

public class Soal1Method {

    static boolean bilangan(int angka) {
        return angka >= 1000 && angka <= 10000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan integer:");
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();

        if (bilangan(angka1) && bilangan(angka2) && bilangan(angka3)) {
            System.out.println("Semua bilangan yang dimasukkan merupakan bilangan ribuan.");
        } else {
            System.out.println("Bilangan yang dimasukkan bukan bilangan ribuan.");
        }

        input.close();
    }
}