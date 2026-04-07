public class Email implements Notification {
    @Override
    public void Notify(String msg){
        System.out.println("Email: " + msg);
    }
}
