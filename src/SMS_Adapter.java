class SMS_Adapter implements Mensagem{

    private SMS mensage;
    
    SMS_Adapter(SMS mensage){
        this.mensage = mensage;
    }

    public void enviar(){
        mensage.Notify("Olha a msg!");
    }
}