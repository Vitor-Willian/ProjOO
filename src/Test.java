public class Test {
    void teste_instance(){
        Config_Global config = Config_Global.getInstance();
        System.out.println("Executando teste inst");
    }
    void teste_notification(){
        
        Notification a = NotificationFactory.create_Email();
        Notification b = NotificationFactory.create_SMS();
        Notification c = NotificationFactory.create_Push();

        a.Notify("Trabalho");
        b.Notify("Fatura");
        c.Notify("Tempestade");

    }
}
