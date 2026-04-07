public class Push implements Notification {
    @Override
    public void Notify(String msg){
        System.out.println("Push: " + msg);
    }
}