package GenericCalculator;
import Exceptions.MyCustomUncheckedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.List;

public class Calculator2 {

        String name;
        private static final Logger logger = LogManager.getLogger(Calculator2.class);


        public void validOperation(String operatie) {
                if (!isValidOperation(operatie)) {
                        throw new MyCustomUncheckedException();
                }else {

                        Calculator2 calculator2 = new Calculator2();

                        calculator2.name = "Calculator2";

                        logger.info(calculator2.name + ": Suma numerelor este " + new Operation().sum(13, 2));
                        logger.info(calculator2.name + ": Diferenta numerelor este " + new Operation().sum(45, 1.5));
                        logger.info(calculator2.name + ": Impartirea numerelor este " + new Operation().sum(22, 0.6));
                        logger.info(calculator2.name + ": Diferenta numerelor este " + new Operation().sum(6.8, 3));

                }
        }

        private boolean isValidOperation(String operatie) {


        List<String> operatiPermise = Arrays.asList("+","-","/","*");

                if (operatiPermise.contains(operatie)) {
                        return true;
                }
                return false;
        }
}



