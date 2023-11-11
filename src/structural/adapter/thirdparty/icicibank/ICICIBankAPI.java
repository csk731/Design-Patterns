package structural.adapter.thirdparty.icicibank;

public class ICICIBankAPI {
    public double checkBal() {
        return 12133.56;
    }

    public boolean sendMoney(String from, String to, double amount) {
        return true;
    }
}
