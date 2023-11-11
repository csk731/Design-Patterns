package structural.adapter.APIadapters;

import structural.adapter.thirdparty.icicibank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIadapter {
    private ICICIBankAPI iciciBankAPI=new ICICIBankAPI();
    public double getBal(){
        return iciciBankAPI.checkBal();
    }
    public boolean sendMoney(String from, String to, double amount){
        return iciciBankAPI.sendMoney(from,to,amount);
    }
}
