public class SMS implements Notification {
    @Override
    public String Notify(String msg){
        String resp = "SMS: " + msg;
        return resp;
    }
}