package learnAdvanced.learnOpps.abstractLearn;

public abstract class Mobile implements ElDevice{
    public void start() {
        System.out.println("Mobile is started");
    };

    public void sendMessage() {
        System.out.println("Mobile try to send message");
    };
}
