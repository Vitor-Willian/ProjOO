public class Config_Global {
    private Config_Global() {}

    private static Config_Global instance;

    public static Config_Global getInstance(){
        if (instance == null)
            instance = new Config_Global();
        return instance;
    }
}
