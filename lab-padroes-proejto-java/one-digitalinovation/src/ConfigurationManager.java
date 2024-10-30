public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configValue;

    
    private ConfigurationManager() {
        configValue = "Configuração Inicial";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
