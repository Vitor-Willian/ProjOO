public class Push implements Notification {
    @Override
    public String Notify(String msg){
        String resp = "Push: " + msg;
        return resp;
    }
}