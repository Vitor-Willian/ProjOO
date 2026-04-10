class Proxy_Notification implements Notification{

    private Notification notification;

    public Proxy_Notification(Notification notification){
        this.notification = notification;
    }

    @Override
    public String Notify(String msg){
        System.out.println("PROXY: Verificando...");

        if (msg == null || msg.isEmpty()){
            System.out.println("PROXY: Erro - Notificação inválida");
            return "Error";
        }
        
        System.out.println("PROXY: Enviando...");
        notification.Notify(msg);
        return "Enviado";
    }
}