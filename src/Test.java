public class Test {
    void teste_instance(){
        Config_Global config = Config_Global.getInstance();
        config.setConfig();
    }
    void teste_notification(){
        
        Notification a = NotificationFactory.create_Email();
        Notification b = NotificationFactory.create_SMS();
        Notification c = NotificationFactory.create_Push();

        System.out.println(a.Notify("Trabalho"));
        System.out.println(b.Notify("Fatura"));
        System.out.println(c.Notify("Tempo"));

        Notification proxy = new Proxy_Notification(a);

        System.out.println(proxy.Notify("Trabalho"));

    }

    void teste_adapter() {

        SMS sms = new SMS();

        Mensagem adp = new SMS_Adapter(sms);

        System.out.println(adp.enviar());
    }
}
