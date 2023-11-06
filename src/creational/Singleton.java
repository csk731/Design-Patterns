package creational;

class Phone{
    static Phone instance=null;
    public static Phone getPhone() {
        // Double Lock system which avoids Concurrency problem
        if(instance==null){
            synchronized(Phone.class) {
                if (instance == null) {
                    instance = new Phone();
                }
            }
        }
        return instance;
    }
    private Phone(){

    }
    public void makeCall(String num){
        // Make Call Logic
    }
    public void endCall(){
        // End Call Logic
    }
}
class Threads1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println(Phone.getPhone());
        }
    }
}

public class Singleton extends Thread{
    public static void main(String[] args) {
        new Threads1().start();
        new Threads1().start();
        new Threads1().start();
    }
}
