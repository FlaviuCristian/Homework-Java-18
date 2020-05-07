package GenericCalculator;

import Exceptions.MyCustomCheckedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MainCalculator1 {
    private static final Logger logger = LogManager.getLogger(MainCalculator1.class);

    public static void main(String[] args) {

        Calculator1 calculator1 = new Calculator1();

        try {
            calculator1.calculatorValidate("u");
        } catch (MyCustomCheckedException exception){
            logger.error("850,\" Caracter Invalid\"");
        }
    }
}
