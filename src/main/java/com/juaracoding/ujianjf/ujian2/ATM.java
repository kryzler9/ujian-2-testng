package com.juaracoding.ujianjf.ujian2;

    public class ATM {
        private double saldo;


        public ATM(double saldoAwal) {
            this.saldo = saldoAwal;
        }

        // Lihat saldo
        public double lihatSaldo() {
            return saldo;
        }

        // Setor Uang
        public void setorUang(double jumlah) {
            if (jumlah > 0) {
                saldo += jumlah;
            } else {
                throw new IllegalArgumentException("Jumlah yang disetor harus lebih besar dari 0");
            }
        }

        // Tarik Uang
        public void tarikUang(double jumlah) {
            if (jumlah >  0 && jumlah <= saldo) {
                saldo -= jumlah;
            } else if (jumlah > saldo) {
                throw new IllegalArgumentException("Saldo tidak mencukupi");
            } else {
                throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
            }
        }
    }


