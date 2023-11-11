package structural.adapter.APIadapters;

import structural.adapter.thirdparty.yesbank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIadapter{
    private YesBankAPI yesBankAPI=new YesBankAPI();
    public double getBal(){
        return yesBankAPI.checkBal();
    }
    public boolean sendMoney(String from, String to, double amount){
        return yesBankAPI.sendMoney(from,to,amount);
    }
}
