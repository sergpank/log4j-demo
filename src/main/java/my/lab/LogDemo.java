package my.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class LogDemo
{
    private static final Logger log = LoggerFactory.getLogger(LogDemo.class);
//    private static final Logger log = LogManager.getLogger(LogDemo.class);

    public static void main(String[] args)
    {
        new LogDemo().demo();
    }

    public void demo()
    {
        log.trace("tracing message");
        log.debug("debug message");
        log.info ("information message");
        log.warn ("warning message");
        log.error("error message");
    }
}
