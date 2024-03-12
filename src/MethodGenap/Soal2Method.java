/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Method Genap :
2. Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menentukan
sebuah bilangan prima atau komposit melalui data inputan dari scanf dengan batasan
inputan batasAwal >=1 dan batasAkhir <=100
 */

package MethodGenap;

import java.util.Scanner;

public class Soal2Method {

    static boolean bilangan(int data) {
        if (data <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(data); i++) {
            if (data % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Batas inputan harus diantara 1 dan 100 tidak boleh lebih!!.");
            return;
        }

        System.out.println("Bilangan prima di antara " + batasAwal + " dan " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (bilangan(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan komposit di antara " + batasAwal + " dan " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!bilangan(i)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}