package structural.adapter.APIadapters;

public interface BankAPIadapter {
    public double getBal();
    public boolean sendMoney(String from, String to, double amount);
}
