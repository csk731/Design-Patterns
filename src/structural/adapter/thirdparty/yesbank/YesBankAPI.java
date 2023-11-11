package structural.adapter.thirdparty.yesbank;

public class YesBankAPI{
    public double checkBal() {
        return 145453.00;
    }

    public boolean sendMoney(String from, String to, double amount) {
        return true;
    }
}
