
interface StatusChecker {
    boolean isRunning();
}

 
class Engine implements StatusChecker {
    private boolean running = true;
    @Override
    public boolean isRunning() {
        return running;
    }
}

 
public class Example8 {
    public static void main(String[] args) {
        StatusChecker engine = new Engine();
        if (engine.isRunning()) {
            System.out.println("The engine is active.");
        } else {
            System.out.println("The engine is stopped.");
        }
    }
}