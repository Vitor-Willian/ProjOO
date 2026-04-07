public class App {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.teste_notification();
        test.teste_instance();
    }
}

class NotificationFactory {
    public static Notification create_Email() {
        return new Email();
    }
    public static Notification create_SMS() {
        return new SMS();
    }
    public static Notification create_Push() {
        return new Push();
    }
}