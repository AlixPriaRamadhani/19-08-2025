

public class accounttest {
    public static void main(String[] args) {
        savingaccount account1 = new savingaccount();
        account1.nama = "Kapten Morgan";
        account1.saldo = 1000.0;
        account1.bunga = 0.02;
        account1.cetak();

        savingaccount account2 = new savingaccount();
        account2.nama = "jack Daniels";
        account2.saldo = 2000.0;
        account2.cetak();
    }
}
