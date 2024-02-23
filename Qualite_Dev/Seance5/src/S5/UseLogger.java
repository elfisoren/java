package S5;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UseLogger {
    private final static Logger LOGGER = Logger.getLogger("T1");//TODO


    public void doSomeThingAndLog() {
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");

        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
    }


	 
	
    
    
    public static void main(String[] args) {
    	MyLoggerConfiguration.setup();
    	UseLogger  l1 = new UseLogger();
        l1.doSomeThingAndLog();
    }
}