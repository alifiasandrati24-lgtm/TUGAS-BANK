class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga Bank BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        int biaya = hitungBiaya(bankTujuan);

        System.out.println("Transfer sebesar Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan biaya Rp" + biaya);
    }

    int hitungBiaya(String bankTujuan) {
        return 6500; // biaya contoh
    }
}