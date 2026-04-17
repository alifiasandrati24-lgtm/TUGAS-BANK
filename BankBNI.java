class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga Bank BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiaya(bankTujuan);

        System.out.println("Transfer sebesar Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan biaya Rp" + biaya);
    }

    int hitungBiaya(String bankTujuan) {
        return 4000; // biaya contoh
    }
}