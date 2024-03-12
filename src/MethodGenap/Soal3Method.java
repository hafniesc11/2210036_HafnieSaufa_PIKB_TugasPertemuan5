/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Method Genap :
3. Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menulis sebuah
program yang akan mencetak berbagai output sebagai berikut, tergantung nilai N yang
dibaca. N dapat berharga antara 1 s.d. 1000:
 */

package MethodGenap;

import java.util.Scanner;

public class Soal3Method {

    static void Pola(int N) {
        if (N < 1 || N > 1000) {
            System.out.println("Tidak ada hasil dari nilai " + N + ", "
                    + "masukkan nilai rentang 1 sd 1000 saja!!");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        Pola(N);

        input.close();
    }
}