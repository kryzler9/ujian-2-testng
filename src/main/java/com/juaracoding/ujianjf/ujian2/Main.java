package com.juaracoding.ujianjf.ujian2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(0);
        boolean selesai = false;

        while(!selesai){
            System.out.println("Pilih menu: ");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setoran");
            System.out.println("3. Penarikan");
            System.out.println("4. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo anda: "+atm.lihatSaldo());
                    break;
                case 2:
                    System.out.println("Masukkan jumlah uang yang ingin disetor: ");
                    double setor = scanner.nextDouble();
                    try {
                        atm.setorUang(setor);
                        System.out.println("Setoran berhasil. Saldo baru: " + atm.lihatSaldo());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
                    double tarik = scanner.nextDouble();
                    try {
                        atm.tarikUang(tarik);
                        System.out.println("Penarikan berhasil. Saldo baru: " + atm.lihatSaldo());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
