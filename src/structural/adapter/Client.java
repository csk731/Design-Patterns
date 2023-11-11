package structural.adapter;

import structural.adapter.APIadapters.ICICIBankAPIAdapter;

public class Client {
    public static void main(String[] args) {
        Application application=new Application(new ICICIBankAPIAdapter());
        System.out.println(application.getBal());
        System.out.println(application.sendMoney("A","B",2450));
    }
}
