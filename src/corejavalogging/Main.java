package corejavalogging;

import java.util.logging.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        // example
        Handler handler = new ConsoleHandler();
        logger.addHandler(handler);
        // formats to XML form
        handler.setFormatter(new XMLFormatter());

        logger.log(Level.INFO, "This is informational log");
        logger.log(Level.WARNING, "This is informational log");
    }
    
}
