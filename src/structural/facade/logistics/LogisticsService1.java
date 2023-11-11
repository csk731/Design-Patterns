package structural.facade.logistics;

public class LogisticsService1 implements LogisticsService{

    @Override
    public boolean informlogistics() {
        // Informing
        System.out.println("Logistics Request Sent");
        return true;
    }
}
