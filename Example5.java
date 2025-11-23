
interface Loggable {
    void log(String message); 

   
    default void logInfo(String message) {
        System.out.println("INFO: " + message);
    }
}


class FileLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println("File Log: " + message);
    }
}


public class Example5 {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger();
        logger.log("Error occurred.");
        logger.logInfo("Process started."); 
}
}