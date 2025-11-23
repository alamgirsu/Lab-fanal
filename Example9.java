
interface AppConstants {
    String APP_NAME = "MyBasicApp";
    int MAX_USERS = 50;
}


class Config implements AppConstants {
    public void displayConfig() {
        System.out.println("App Name: " + APP_NAME);
        System.out.println("Max Users: " + MAX_USERS);
    }
}


public class Example9 {
    public static void main(String[] args) {
        Config cfg = new Config();
        cfg.displayConfig();
    }
}