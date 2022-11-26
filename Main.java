package P10_ASS2_ASD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        Scanner input = new Scanner(System.in);

        String loop = "y";
        do {
            System.out.println("Selamat datang di aplikasi antrian");
            System.out.println("Silakan pilih menu");
            System.out.println("1. Daftar");
            System.out.println("2. Panggil");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda : ");
            int pilih = input.nextInt();

            System.out.println("");

            switch (pilih) {
                case 1: {
                    System.out.print("Masukan nama : ");
                    String daftar = input.next();
                    queue.enqueue(daftar);
                    System.out.println(daftar + ", antrian anda bernomor " + (queue.peek() + 1));
                    System.out.println("");
                    break;
                }
                case 2: {
                    if (queue.size() > 0) {
                        System.out.println("No antrian " + (queue.peek() + 1) + ", silahkan masuk");
                        queue.dequeue();
                        System.out.println("");
                    } else {
                        System.out.println("Tidak ada antrian");
                        System.out.println("");
                    }
                    break;
                }
                case 3: {
                    if (queue.size() > 0) {
                        System.out.println("Masih ada antrian dalam system");
                        System.out.println("");
                    } else {
                        loop = "t";
                    }
                    break;
                }
                default: {
                    System.out.println("Pilihan tidak tersedia");
                    System.out.println("");
                }

            }
        } while (loop != "t");

        System.out.println("Terima kasih telah menggunakan program ini");
    }
}