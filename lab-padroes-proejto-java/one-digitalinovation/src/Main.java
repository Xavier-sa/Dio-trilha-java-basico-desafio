public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        System.out.println("Config1: " + config1.getConfigValue());

        ConfigurationManager config2 = ConfigurationManager.getInstance();
        config2.setConfigValue("Nova Configuração");

        System.out.println("Config1 após alteração: " + config1.getConfigValue());
        System.out.println("Config2: " + config2.getConfigValue());
    }
}
