package Exceptions;

import GenericCalculator.Calculator2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyCustomUncheckedException extends RuntimeException{
    final Logger logger = LogManager.getLogger(Calculator2.class);

    public MyCustomUncheckedException(){
        logger.debug("950, \" Operatie nepermmisa\"");
    }
}
