package structural.adapter;

import structural.adapter.APIadapters.BankAPIadapter;

public class Application {
    private BankAPIadapter bankApIadapter;
    public Application(BankAPIadapter bankApIadapter) {
        this.bankApIadapter = bankApIadapter;
    }
    public double getBal(){
        return bankApIadapter.getBal();
    }
    public boolean sendMoney(String from, String to, double amount){
        return bankApIadapter.sendMoney(from,to,amount);
    }
}
