package GenericCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MainCalculator2 {
    private static final Logger logger = LogManager.getLogger(MainCalculator1.class);

    public static void main(String[] args) {

        Calculator2 calculator2 = new Calculator2();
        calculator2.validOperation("/");
    }
}

