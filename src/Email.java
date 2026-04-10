public class Email implements Notification {
    @Override
    public String Notify(String msg){
        String resp = "Email: " + msg;
        return resp;
    }
}
