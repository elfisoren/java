package S5;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLoggerConfiguration {
	private static final Logger LOGGER = Logger.getLogger("");
	
	public static void setup() {
		try {
		FileHandler fileHandler = new FileHandler("Logs.txt");
		fileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(fileHandler);
		//LOGGER.log(Level.INFO, "ça test les logs ici bas");
		FileHandler fileHandlerHTML = new FileHandler("index.html");
		fileHandlerHTML.setFormatter(new MyHTMLFormatter());
		LOGGER.addHandler(fileHandlerHTML);
		
		Handler[] handler= LOGGER.getHandlers();
		for(int i=0 ; i< handler.length ; i++) {
			if (handler[i] instanceof ConsoleHandler) {
			    LOGGER.removeHandler(handler[i]);
			}
		}
		}
		catch(Exception excep) {
		LOGGER.severe("Vous vous êtes trompé" + excep);
	}
		}
}
