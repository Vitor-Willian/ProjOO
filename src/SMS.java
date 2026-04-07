public class SMS implements Notification {
    @Override
    public void Notify(String msg){
        System.out.println("SMS: " + msg);
    }
}